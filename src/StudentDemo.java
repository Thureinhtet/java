import java.util.Arrays;

public class StudentDemo {
    public static void main(String[] args) {
        Student student=new Student();
        student.add("Hello");
        student.add("Encapsulation");
        student.show();
        String [] array=student.getArray();
        System.out.println(student.getData().toString());
        Arrays.fill(array,null);
        student.show();
    }
}
