
import java.util.Arrays;

import static java.lang.System.out;

public class CheckDemo {
    private static int count;
    public static void println(Object ... args){
        out.println(Arrays.toString(args));
    }
    public static void main(String[] args) throws Exception {
        var methods=CheckDemo.class.getDeclaredMethods();

        for (var method:methods){
            println(method.getName());
        }
        dobusiness();

    }
    static void hello()throws RuntimeException{
        System.out.println("Say Hello");
    }
    static void dobusiness()throws Exception{
        sayhello();
    }
    static void sayhello() throws Exception {

        if (count<=0){
            throw new Exception();
        }
        System.out.println("Welcome");
    }
}
