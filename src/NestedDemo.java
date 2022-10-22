public class NestedDemo {
    public static void main(String[] args) {
        var wwwe=new NestedDemo();
    }
    static {
        MyClass ww=new MyClass("Hello ") {
            @Override
            void greet() {
                super.greet();
            }
        };
        ww.greet();

        MyInterface b=new MyInterface() {
            @Override
            public void greet() {
                System.out.println("Hello from Anynomous class");
            }
        };
        b.greet();

    }
}
interface MyInterface{
    void greet();
}
abstract class MyClass{
    String name;
    MyClass(String name){
        this.name=name;
    }
    void greet(){
        System.out.println(name);
    }
}
