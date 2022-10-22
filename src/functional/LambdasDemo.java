package functional;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

import static java.lang.System.*;
public class LambdasDemo {
    public static void main(String[] args) {
        List<String> list=List.of("a","b","c");
//        Consumer<String> print=out::println;
//        Consumer<String> printUppercase=(item->out.println(item.toUpperCase()));
//        list.forEach(print.andThen(printUppercase));
//        Function<String,Integer> map= String::length;
//        var lengthofstring=map.apply("key");
//        out.println(lengthofstring);
//        BinaryOperator<Integer> add=(a,b)->a+b;
//        Function<Integer,Integer> square=a->a*a;
//        UnaryOperator<Integer> square=n->n*n;
//        UnaryOperator<Integer> increment=n->n+1;
//       var r= increment.andThen(square).apply(1);
//       out.println(r);
//        Stream.iterate(1,n->n+1).limit(10).forEach(out::println);
//        var stream=Stream.of(List.of(1,2,3),List.of(4,5,6));
//        stream.flatMap(List::stream).forEach(out::println);
//        var result=add.andThen(square).apply(5,5);
//        out.println(result);
        var dis=List.of(1,1,2,3);
        //dis.stream().distinct().forEach(out::println);
       var res= dis.stream().distinct().reduce(0,Integer::sum);
        out.println(res);
    }
    public static void greet(Printer printer){
        printer.print("Hello World");
    }
}
