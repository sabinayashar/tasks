import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;

public class Parallel extends Thread {

    String link;
    File file;
    DecimalFormat df = new DecimalFormat("#.##");

    public Parallel(String link, File file) {
        this.link = link;
        this.file = file;
    }

    @Override
    public void run() {
        try {
            long start = System.currentTimeMillis();
            //URl object
            URL url = new URL(link);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            //get the size of file (# of bytes) to see the process of downloading
            double fileSize = (double) http.getContentLengthLong();
            //get input stream from http connection
            BufferedInputStream bis = new BufferedInputStream(http.getInputStream());
            //save file to pc
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos, 600000);
            byte[] buffer = new byte[1024];
            double downloadedData = 0.00;
            //how many bytes have been read in one iteration
            int readData = 0;

            while ((readData = bis.read(buffer, 0, 1024)) >= 0) {
                //write data to buffered output stream
                bos.write(buffer, 0, readData);
                downloadedData += readData;
            }
            bos.close();
            bis.close();
            System.out.println(file + " -> done");
            long end = System.currentTimeMillis();
            System.out.println("Time: " + df.format((end - start) * 0.001) + " sec");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
