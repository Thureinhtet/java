import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class executor {
    public static void main(String[] args) {
        var list= List.of("いち","に","さん","よん","ご","ろく","しち","はち","きゆう","じゆ");
        var list1=List.of("ひとつ","ふたつ","みつ","よつ","いつつ","むつ","ななつ","やつ","ここのつ","とお");
        var executor= Executors.newFixedThreadPool(5);
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                try {
                    for (var l:list) {
                        System.out.println(l);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }finally {
                    System.out.println("足すと");
                }
            }
        };
        executor.execute(runnable);
        executor.shutdown();
    }

}
