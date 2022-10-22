public class WildCard {
    public static void main(String[] args) {
        Animal animal=new Animal();
        FContainer<Animal> container= new FContainer<>();//fcontainer
        SubContainer<Dog> subContainer= new SubContainer<>();//subcontainer
        FContainer<Animal> container1=new SubContainer<>();
        FContainer<?> c;
        c=new FContainer<String>();
        Container<? extends Bird> bc;
        bc=new Container<Eagle>();
        Container<? super Bird> suw;
        suw=new Container<Animal>();
    }
}


class FContainer<T>{
}
class SubContainer<T extends Animal> extends FContainer<T>{
}
class Animal{
}
class Bird extends Animal{

}
class Eagle extends Bird{

}
class Dog extends Animal{

}