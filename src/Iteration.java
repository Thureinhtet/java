import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;

public class Iteration {
    public static void main(String[] args) {

        var q=new ArrayDeque<String>();
        q.offer("snowball");
        q.offer("minnie");
        q.offer("sugar");
        System.out.println(q.peek()+" "+q.peek()+" "+q.size());

    }
    static void internalFor(List<Integer> list){
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }
    static void forEach(List<Integer> list){
        for (var data:list){
            System.out.println(data);
        }

    }
    static void legacyFor(List<Integer> list){
        for (var i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

}
