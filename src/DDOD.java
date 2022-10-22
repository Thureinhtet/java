interface InterfaceA{
     int f=2;
      default void doJob(){
        System.out.println("Job of a"+f);
    }
}
interface InterfaceB extends InterfaceA{
    @Override
    default void doJob() {
        System.out.println("Job of b");
    }
}
interface InterfaceC extends InterfaceA{
    @Override
    default void doJob() {
        System.out.println("Job of c");
    }
}
interface InterfaceD {

}
class DDOD{
    public static void main(String[] args) {
        InterfaceA interfaceA=new InterfaceA() {
        };
        interfaceA.doJob();
    }
}
