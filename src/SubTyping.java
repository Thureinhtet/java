import java.util.ArrayList;
import java.util.List;

public class SubTyping {
    public static void main(String[] args) {
        List<AnotherPair<Integer,Integer>> anotherPairs=new ArrayList<>();
        anotherPairs.add(new AnotherPair<>(12,12));
        anotherPairs.add(new AnotherPair<>(12,12));
        anotherPairs.add(new AnotherPair<>(12,12));
        anotherPairs.add(new AnotherPair<>(12,12));
        for (AnotherPair<Integer,Integer> a:anotherPairs){
            a.show();
        }
        Pair<String,Integer> integerPair=PairFactory.generate("First",1);
        integerPair.show();
    }
}

class PairFactory{
    static <K,V> Pair <K,V> generate(K key,V value){
        return new Pair<>(key,value);
    }

}
class Pair<K,V>{
    public K key;
    public V value;
    Pair(K key,V value){
        this.key=key;
        this.value=value;
    }
    public void show(){
        System.out.println(key);
        System.out.println(value);
    }
}
class AnotherPair<K,V> extends Pair<K,V>{

    AnotherPair(K key, V value) {
        super(key, value);
    }
}