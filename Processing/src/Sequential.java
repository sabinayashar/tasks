import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;

public class Sequential {

    String[] links;
    File[] files;
    int fileNo = 1;
    DecimalFormat df = new DecimalFormat("#.##");

    public Sequential(String[] links, File[] files) {
        this.links = links;
        this.files = files;
    }

    public void run() {
        try {
            long start = System.currentTimeMillis();
            System.out.println("Mode: Single-threaded");
            System.out.println("Files:");
            for(int i = 0; i <= 3; i++) {
                System.out.println("Downloading file #" + fileNo + "...");
                //URl object
                URL url = new URL(links[i]);
                HttpURLConnection http = (HttpURLConnection) url.openConnection();
                //get the size of file (# of bytes) to see the process of downloading
                double fileSize = (double) http.getContentLengthLong();
                //get input stream from http connection
                BufferedInputStream bis = new BufferedInputStream(http.getInputStream());
                //save file to pc
                FileOutputStream fos = new FileOutputStream(this.files[i]);
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
                System.out.println(this.files[i] + " -> done");
                fileNo++;
            }
            long end = System.currentTimeMillis();
            System.out.println("Time: " + df.format((end - start) * 0.001)  + " sec");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
