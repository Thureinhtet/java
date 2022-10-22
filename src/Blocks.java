import java.util.Properties;
import java.io.FileInputStream;

public class Blocks {
    public static void main(String[] args) {
        SuMi suMi=new SuMi();
        suMi.show();
    }
}
class SuMi{
    String name;
    int count;
    {
        try(FileInputStream input=new FileInputStream("settings.properties")){
            Properties props=new Properties();
            props.load(input);
            name= props.getProperty("name");
            count=Integer.parseInt(props.getProperty("count"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    void show(){
        for (int i=0;i<count;i++){
            System.out.println(name);
        }
    }
}