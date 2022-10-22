import java.io.*;
import java.util.Scanner;

public class DataStreams {
    public static void main(String[] args) {
        var sm=new SecurityManager();
        Scanner scanner;
        scanner=new Scanner(System.in);
        var sf=SecurityManager.getInstance();
        System.out.println("Enter Login Id");
        sf.setLoginId(scanner.nextLine());
        System.out.println("Enter Password");
        sf.setPassword(scanner.nextLine());
        System.out.println("Enter Name");
        sf.setName(scanner.nextLine());
        System.out.println("Enter AccessCount");
        sf.setAccessCount(Integer.parseInt(scanner.nextLine()));
        sm.save(sf);
        sm.read();
    }
}
class SecurityManager{
    private static final String FILE="login.txt";
    public SecurityInfo read(){
        SecurityInfo info=null;
        try (var fileInput=new FileInputStream(FILE);
             var dataInput=new DataInputStream(fileInput)){
            info=new SecurityInfo();
            info.setLoginId(dataInput.readUTF());
            info.setPassword(dataInput.readUTF());
            info.setName(dataInput.readUTF());
            info.setAccessCount(dataInput.readInt());
            System.out.println(info.getName());
            System.out.println(info.getAccessCount());
            System.out.println(info.getLoginId());
            System.out.println(info.getPassword());
        }catch (IOException e){
            e.printStackTrace();
        }
        return info;
    }
    public void save(SecurityInfo securityInfo){
        try (var fileOutput=new FileOutputStream(FILE);
            var dataOutput=new DataOutputStream(fileOutput);
        ){
            dataOutput.writeUTF(securityInfo.getLoginId());
            dataOutput.writeUTF(securityInfo.getName());
            dataOutput.writeUTF(securityInfo.getPassword());
            dataOutput.writeInt(securityInfo.getAccessCount());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static SecurityInfo getInstance(){
        return new SecurityInfo();
    }
}
class SecurityInfo{
    private String loginId;
    private String password;
    private String name;
    private int accessCount;

    public int getAccessCount() {
        return accessCount;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccessCount(int accessCount) {
        this.accessCount = accessCount;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}