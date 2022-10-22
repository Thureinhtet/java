public class OuterDemo {
    public static void main(String[] args) {
        Outer.InnerStatic innerStatic=new Outer.InnerStatic();
        innerStatic.showMessage();
        Outer.Inner inner= new Outer().new Inner();
        inner.showMessage();
    }
}