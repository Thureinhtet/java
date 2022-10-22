import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import static java.lang.System.*;
public class Registration {
    String name;
    String date;
    Type type;
    String course;
    int fees;

    public Registration(String line) {
        var array=line.split(" ");
        name=array[0];
        date=array[1];
        type= Type.valueOf(array[2]);
        course=array[3];
        fees= Integer.parseInt(array[4]);
    }

    public static void main(String[] args) throws IOException {
        var path= Files.lines(Paths.get("registration.txt")).map(Registration::new).collect(Collectors.toList());
        var s=path.stream().filter(a->a.getCourse().equals("Java")).mapToInt(gg-> gg.getFees()).sum();
        var uu=path.stream().map(Registration::getFees).reduce(0,Integer::sum);
        out.println(uu);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
}
enum Type{
    Online,
    Offline
}