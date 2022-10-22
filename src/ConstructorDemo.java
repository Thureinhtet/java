
public class ConstructorDemo {
    public static void main(String[] args) {
        Welcome welcome=new Welcome(3);
        welcome.greet();
    }
}
class Welcome {
    static int count;

    Welcome(int count){
        Welcome.count=count;
    }
    void greet(){
        for (int i=0;i<count;i++){
            System.out.println("Hello Java");
        }
    }
}