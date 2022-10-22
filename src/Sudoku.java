
import java.util.Arrays;
public class Sudoku {
    static int [][] game;

    public static void main(String[] args) {
        sortSearch("seed","flower");
    }
    static void sortSearch(String... args){
        var one=args[0];
        Arrays.sort(args);
        int result=Arrays.binarySearch(args,one);
        System.out.println(result);
    }
}
