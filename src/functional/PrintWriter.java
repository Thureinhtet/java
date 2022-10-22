package functional;

public class PrintWriter implements  Printer{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
