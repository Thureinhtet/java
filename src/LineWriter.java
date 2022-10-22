import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LineWriter {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter file name : ");
        try (var out=new PrintWriter(scanner.nextLine())){
            var line="";
            while ((line= scanner.nextLine())!=null){
                if (line.equals("N")){
                    break;
                }
                out.println(line);
            }
        }
    }
}
