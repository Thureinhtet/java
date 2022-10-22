package concurrency;
import static java.lang.System.*;
public class DownloadFileTask implements Runnable{
    @Override
    public void run() {
        out.println("Starting download"+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        out.println("Download Complete :"+Thread.currentThread().getName());
    }
}
