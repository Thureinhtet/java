class Person{
    String name;
    Person(String name){
        this.name=name;
    }
    void greet(){
        System.out.println("Hello I am "+name);
    }
}
class Teacher extends Person{
    Teacher(String name) {
        super(name);
        this.name=name;
    }
    @Override
    void greet() {
        super.greet();
    }
    void teach(){
        System.out.println("I am teaching");
    }
}
public class Inheritance {
    public static void main(String[] args) {
//        Teacher teacher= (Teacher) new Person("Daw Hla");
        Person person=new Teacher("Daw Mya");
        Teacher teacher=new Teacher("another");
        teacher.greet();
        person.greet();
    }
}