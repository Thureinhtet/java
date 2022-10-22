import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreams {
    private static Scanner scanner;
    static {
        scanner=new Scanner(System.in);
    }
    public static void main(String[] args) {
        System.out.println("Input:I");
        System.out.println("Output:O");
        System.out.println("your answer:");
        String answer=scanner.nextLine();
        if (answer.equals("I")){
            read();
        }else if (answer.equals("O")){
            write();
        }else {
            System.out.println("Error");
        }
    }
    static void read(){
        String filename=getFileName();
        try (var reader=new FileReader(filename)){
            int readed;
            String str="";
            while ((readed=reader.read())>=0){
                char character=(char) readed;
                str+= Character.toString(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void write(){
        String filename=getFileName();
        System.out.println("Enter message demo");
        var message=scanner.nextLine();
        try (var writer=new FileWriter(filename,true)){
            char [] array=message.toCharArray();
            for (int i=0;i<array.length;i++){
                writer.write(array[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static String getFileName(){
        System.out.println("Enter File Name:");
        return scanner.nextLine();
    }
}
