import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class Serialization {
    private static final String FILE="custom.txt";
    public static void main(String[] args) {
        if (args.length==0){
            write();
        }else {
            read();
        }
    }
    private static void write(){
        try (var out=new ObjectOutputStream(new FileOutputStream(FILE))){
            var data=new User("Thidar",20,"Java");
            System.out.println(data);
            out.writeObject(data);
            System.out.println("Success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read(){
        try (var input=new ObjectInputStream(new FileInputStream(FILE))){
            User obj=(User) input.readObject();
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class User implements Serializable{
    private static final long serialVersionUID=1L;
    String name;
    int age;
    Date date;
    transient Subject subject;
    User(String name,int age,String subject){
        this.name=name;
        this.age=age;
        this.date=new Date();
        this.subject=new Subject(subject);
    }

    @Override
    public String toString() {
        return String.format("{name:%s,age:%s,date:%s,subject:%s}",name,age,date,subject);
    }
}
class Subject{
    String name;
    Subject(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return String.format("{name:%s}",name);
    }
}