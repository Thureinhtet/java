import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map=new LinkedHashMap<>();
        setData(map);
        var key=map.values();
        System.out.println(key);
    }
   static void setData(Map<Integer,String> map){
        for (int i = 10; i>0; i-- ){
            map.put(i, Integer.toString(i));
        }
    }
}
