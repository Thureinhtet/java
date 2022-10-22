public class HelloStatic {
    public static void main(String[] args) {
        Helloe.heww();
    }
}
interface Helloe{
    void first(String message);
    static void heww(){
        System.out.println("hello project lambda");
    }
    default void hello(){
        System.out.println("Hello");
    }
}
 class DataProducer{
    static void hello(String message){
        System.out.println(message);
    }
}
interface One{
}
