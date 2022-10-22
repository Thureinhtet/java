public class OverrideDemo {
    public static void main(String[] args) {
        System.exit(0);
    }
    static void test(SuperClass obj)  {
        try {
            obj.dosomething();
        }catch (MyException | MyException1 e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Program is end");
        }
    }
}
class SuperClass{
    void dosomething()throws Exception {
        System.out.println("Hello from Super class");
        throw new Exception();
    }
}
class SubClass extends SuperClass{
    @Override
    void dosomething() throws MyException1 {
        System.out.println("Hello from sub class");
    }
}
class MyException extends Exception{

}
class MyException1 extends Exception{

}