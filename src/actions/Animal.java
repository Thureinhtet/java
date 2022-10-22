package actions;
public abstract class Animal{
    abstract String getName();
    Animal(){
        System.out.println("constructor");
    }
}
 abstract class BigCat extends Animal{
    protected abstract void roar();
}
 class Lion extends BigCat{

    @Override
    String getName() {
        return "Lion";
    }

    @Override
    protected void roar() {
        System.out.println("The Lion lets out a loud Roar!");
    }

     public static void main(String[] args) {
         new Lion();
     }
}
