public class Outer {
    public static void staticMessage(){
        InnerStatic innerStatic=new InnerStatic();
        innerStatic.showMessage();
    }
    public void showMessage(){
        InnerStatic obj1=new InnerStatic();
        obj1.showMessage();
        Inner obj2=new Inner();
        obj2.showMessage();
    }
    //nested class
    public static class InnerStatic {
        public void showMessage(){
            System.out.println("Hello from static Nested Class");
        }
    }
    //inner class
    public class Inner {
        public void showMessage(){
            System.out.println("Hello from Inner class");
        }
    }
}
