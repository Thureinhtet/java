abstract class Abstraction {
    abstract void greet();
    public void feed(String food){

    }
    String name;
    Abstraction(String name){
        this.name=name;
    }
    abstract void wash();
}
class Runner{
    public static void main(String[] args) {
        Zoo zoo=new Zoo();
        zoo.add(new Elephant("wwwe"));
        zoo.wash();
    }
}
class Zoo {
    Abstraction[] abstractions=new Abstraction[10];
    boolean add(Abstraction abstraction){
        for (int i=0;i<abstractions.length;i++){
            if (abstractions[i]==null){
                abstractions[i]=abstraction;
                return true;
            }
        }
        return false;
    }
    void wash(){
        for (Abstraction abstraction:abstractions){
            if (abstraction instanceof Elephant){
                Elephant e= (Elephant) abstraction;
                e.wash();
            }
        }
    }
}
class Elephant extends Abstraction{

    Elephant(String name) {
        super(name);
    }

    @Override
    void greet() {

    }

    @Override
    void wash() {
        System.out.println("Washing");
    }
}