import java.util.Arrays;

public class AnotherGenerics {
    public static void main(String[] args) {
        var container=new AnotherContainer<Object>();
        container.add(25);
        container.add("Hello");
        System.out.println(container.show(0));
        System.out.println(Arrays.toString(container.getArray()));
    }
}
class AnotherContainer<T>{
    public T [] array= (T[]) new Object[0];
    public void add(T data){
        array= Arrays.copyOf(array,array.length+1);
        array[array.length-1]=data;
    }
    public T show(T data){
        return array[(int) data];
    }
    public T [] getArray(){
        return Arrays.copyOf(array,array.length+1);
    }

}
