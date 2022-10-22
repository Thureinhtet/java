import java.io.*;
import java.util.*;

public class LineReader {
    public static void main(String[] args) {
        System.out.println("Enter file Name");
        String filename=new Scanner(System.in).next();
        System.out.println();
        showpoem(filename);
    }
    public static void showpoem(String filename){
        var line="";
        try (var reader=new BufferedReader(new FileReader(filename))){
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
