import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.lang.System.*;
public class stream {
    public static void main(String[] args) throws IOException {
       var a= IntStream.of(1,2,3);
       var b=IntStream.rangeClosed(1,5);
       var c=IntStream.concat(a,b);

       var charStream= Stream.iterate(1,operator->operator+1);
//       charStream.limit(20).distinct().sorted((first,second)->second-first).forEach(System.out::println);
       var list=List.of(new NewData(2),new NewData(3),new NewData(4));
       list.stream().sorted((f,s)->s.data-f.data).mapToInt(data->data.data).sum();
        var list1=List.of("a","b","c");
        var list2=List.of("d","e","f");
        var list3=List.of("g","h","i");
        var result=List.of(list1,list2,list3);
        var ewp=result.stream().flatMap(List::stream).map(String::toUpperCase);
//        var newstream= Files.lines(Paths.get("product.txt"));
//       var obj= newstream.map((String cha)->cha.split(" "));
//       var ProductStream=obj.map(w->new Product(w[0],Integer.parseInt(w[1])));
////       var sum=ProductStream.mapToInt(res->res.price).sum();
////        out.println(sum);
//        var e=ProductStream.collect(Collectors.toList());
//        out.println(e);
//        var newstream=Files.lines(Paths.get("product.txt")).map(cha->cha.split(" ")).map(w->new Product(w[0],Integer.parseInt(w[1]))).collect(Collectors.toList());
        var potesan=Files.lines(Path.of("newdata.txt")).map(Product::new).collect(Collectors.toList());
        var meew=potesan.stream().map(Product::getPrice).reduce(0,(f, s)->f+s);
        out.println(meew);
        out.println( potesan.stream().mapToInt(Product::getPrice).sum());
//        var products=potesan.stream().peek(product -> {
//            var price=product.getPrice()+200;
//            product.setPrice(price);
//        }).collect(Collectors.toList());
//        out.println(products);
        var newdata=List.of(new NewData(2),new NewData(5),new NewData(8));
        var arrloe=List.of(potesan,newdata);
//        var ewwew=arrloe.stream().flatMap(List::stream).map(Object::getClass).map(Class::getClasses).toArray();
//        var werw=IntStream.rangeClosed(1,10).anyMatch(bc->bc/5==1);
        var array1=Files.lines(Paths.get("product.txt")).map(Product::new).toArray(Product[]::new);
        out.println(array1[0]);
        var productOptional=findMaxProductPrice(array1,500);
        productOptional.ifPresentOrElse(out::println,()->out.println("No Data"));
    }

    static Optional<Product>  findMaxProductPrice(Product[] products,int lowerlimit) {
        var array=Arrays.stream(products).filter(product -> product.getPrice()>=lowerlimit).map((Product p)->{var result=p;
            return result;
        });
       return array.findAny();
    }
}
class NewData{
    int data;
    NewData(int data){
        this.data=data;
    }

    @Override
    public String toString() {
        return "NewData{" +
                "data=" + data +
                '}';
    }
}
class Product{
    String data;
    int price;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String line) {
        var array=line.split(" ");

        this.data = array[0];
        this.price = Integer.parseInt(array[1]);
    }

    @Override
    public String toString() {
        return "Product{" +
                "data='" + data + '\'' +
                ", price=" + price +
                '}';
    }
}
