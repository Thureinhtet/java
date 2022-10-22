import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.function.Consumer;

public class QueueIteration {
    public static void main(String[] args) {
        Queue<String> queue=new ArrayDeque<>(List.of("Hello","Java","Css","Angular"));
        loop(queue,false);
    }
    static void internal(Queue<String> queue){
        queue.forEach(new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        });
    }
    static void external(Queue<String> queue){
        for (String str:queue){
            System.out.println(str);
        }
    }
    static void loop(Queue<String> queue,boolean firstEnd){
        Deque<String> deque=new ArrayDeque<>(queue);
        while (!deque.isEmpty()){
            if (firstEnd){
                System.out.println(deque.pollFirst());
            }else {
                System.out.println(deque.pollLast());
            }
        }
    }
}
