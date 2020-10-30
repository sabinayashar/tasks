import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        String[] links = {"http://www.ubicomp.org/ubicomp2003/adjunct_proceedings/proceedings.pdf", "https://www.hq.nasa.gov/alsj/a17/A17_FlightPlan.pdf", "https://ars.els-cdn.com/content/image/1-s2.0-S0140673617321293-mmc1.pdf", "http://www.visitgreece.gr/deployedFiles/StaticFiles/maps/Peloponnese_map.pdf"};
        File[] files = new File[4];
        files[0] = new File("C:\\Users\\lenovo\\Desktop\\file1.pdf");
        files[1] = new File("C:\\Users\\lenovo\\Desktop\\file2.pdf");
        files[2] = new File("C:\\Users\\lenovo\\Desktop\\file3.pdf");
        files[3] = new File("C:\\Users\\lenovo\\Desktop\\file4.pdf");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thread mode (0 -> single; 1 -> multi): ");
        int mode = sc.nextInt();

        if (mode == 0) {
            new Sequential(links, files).run();
        } else {
            System.out.println("Mode: Multi-threaded");
            System.out.println("Files:");
            int cores = Runtime.getRuntime().availableProcessors();
            ExecutorService executor = Executors.newFixedThreadPool(cores);

            for(int i = 0; i <= 3; i++) {
                Runnable worker = new Parallel(links[i], files[i]);
                executor.execute(worker);
            }
            executor.shutdown();
        }

    }
}
