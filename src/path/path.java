package path;

import concurrency.DownloadFileTask;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

import static java.lang.System.*;

public class path {
    public static void main(String[] args) throws IOException, InterruptedException {
//       var folder= Path.of("folder");
//       var sub=folder.resolve("sub");
//       var hello=sub.resolve("child/hello.txt");
//       var dir=Files.newDirectoryStream(sub);
//        for (var p:dir) {
//            out.println(p);
//        }
//       var hello=Path.of("hello.txt");
//       var copy=Path.of("other.txt");
//       var newcopy=Files.copy(new FileInputStream("hello.txt"),copy,StandardCopyOption.REPLACE_EXISTING);
//        out.println(Thread.currentThread().getName());
//        Thread thread=new Thread(new DownloadFileTask());
//        thread.start();
//        thread.join();
//        out.println("File is already to be scanned");
        var collections=new ArrayList<>();
        var thread1=new Thread(()->{
            collections.addAll(Arrays.asList(1,2,3));
        });
        var thread2=new Thread(()->{
           collections.addAll(Arrays.asList(4,5,6));
        });
        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1000);
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        out.println(collections);
    }
}
