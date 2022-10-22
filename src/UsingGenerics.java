import java.util.Arrays;

public class UsingGenerics {
    public static void main(String[] args) {
        var container=new Container<Integer>();
        container.add(25);
        container.add(65);
        System.out.println(container.get(0));
        System.out.println(Arrays.toString(container.getAll()));
    }
}
class Container<T>{
    @SuppressWarnings("unchecked")
    private T [] array= (T[]) new Object[0];
    public void add(T message){
        array= Arrays.copyOf(array,array.length+1);
        array[array.length-1]=message;
    }
    public T get(T index){
        return array[(int) index];
    }
    public T [] getAll(){
        return Arrays.copyOf(array,array.length);
    }

}