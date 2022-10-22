import com.java.api.Messanger;
import com.java.api.MessangerFactory;

public class MessangerDemo {
    public static void main(String[] args) {
        Messanger m= MessangerFactory.generate();
        m.send("Thurein Htet");
    }
}
