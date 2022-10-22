import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class WhileDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean same=false;
        while (!same){
            System.out.println("Guess Number 1...5");
            String input=scanner.nextLine();
            int userinput=Integer.parseInt(input);
            int generated= ThreadLocalRandom.current().nextInt(1,5);
            same=userinput==generated;
            String result=same?"You win":"You lose";
            System.out.println(result);
            System.out.println("Win number :"+generated);
        }
    }
}
