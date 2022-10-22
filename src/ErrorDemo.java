
public class ErrorDemo {
    public static void main(String[] args) {
        try {
            makeError(0);
        }catch (Exception e){
            e.printStackTrace();
        }catch (StackOverflowError e){
            e.printStackTrace();
        }catch (Error e){
            e.printStackTrace();
        }
        System.out.println("End program");


    }

    static void makeError(int count){
        System.out.println("Count is:"+ ++count);
        makeError(count);
    }
}
