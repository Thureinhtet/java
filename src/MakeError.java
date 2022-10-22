public class MakeError {
    public static void main(String[] args) {
        System.out.println("Start Class");
        try {
            method1();
        }catch (ArithmeticException e){
            System.out.println("System error in main method");
        }
        System.out.println("End Class");
    }
    static void method1(){
        System.out.println("Method 1");
        method2();
        System.out.println("Method 1 End");
    }
    static void method2(){
        System.out.println("Method 2");
        method3();
        System.out.println("Method 2 End");
    }
    static void method3(){
        System.out.println("Method 3");
        method4();
        System.out.println("Method 3 End");
    }
    static void method4(){
        System.out.println("Method 4");
        try {
            int i=10/0;
        }catch (ArithmeticException e){
            System.out.println("Error in method 4");
        }
        System.out.println("Method 4 End");
    }
}
