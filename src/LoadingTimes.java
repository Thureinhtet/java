import java.util.Scanner;

public class LoadingTimes {
    public static void main(String[] args) {
        System.out.println("start program");
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        Loading loading;
        System.out.println("Declare class");
        sc.nextLine();
        loading=new Loading();
        System.out.println("Declare Object");
        sc.nextLine();
        loading=new Loading();
        System.out.println("Declare Object");
        sc.nextLine();
        System.out.println("Finished process");
    }
}
class Loading{
    static {
        System.out.println("static block");
    }
    {
        System.out.println("Instance Blocks");
    }
    Loading(){
        System.out.println("Constructor blocks");
    }
}