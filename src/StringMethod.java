import java.util.Arrays;

public class StringMethod {
   static String str="Hello Java  adferwerewra";
    public static void main(String[] args) {
       StringMethod.searchIndex(str,'a');
    }
    static void searchIndex(String str,char c){
        int [] array={};
        int index=-1;
        while ((index=str.indexOf(c,index+1))>=0){
            System.out.println(index);
            array=Arrays.copyOf(array,array.length+1);
            array[array.length-1]=index;
        }
        System.out.println(Arrays.toString(array));
    }


}
