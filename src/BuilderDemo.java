public class BuilderDemo {
    public static void main(String[] args) {
        Hello builder=HelloBuilder.builder().name("Hello").message("Thurein").build();
        System.out.println(builder.name);
    }
}
interface Builder{
    Hello build();
}
class Hello{
    String name;
    String message;
    int count;
    Hello other;
    Hello(String name,String message,int count,Hello other){

    }
}
class HelloBuilder{
    String name;
    String greeting;
    int count;
    Hello others;
    HelloBuilder name(String name){
        this.name=name;
        return this;
    }
    HelloBuilder message(String greeting){
        this.greeting=greeting;
        return this;
    }
    static HelloBuilder builder(){
        return new HelloBuilder();
    }
     Hello build(){
        return new Hello(name,greeting,count,others);
    }
}