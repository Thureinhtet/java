import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteStreams {
    public static void main(String[] args) {
        if (args.length>=2){
            if (args[0].equals("I")){
                System.out.println("Read Demo");
                read(args[1]);
            }else if (args[0].equals("O")){
                System.out.println("Write Demo");
                write(args[1],args[2]);
            }
        }
    }
    static void write(String fileName,String message){
        var array=message.getBytes();
        try (var out=new FileOutputStream(fileName)){
            for (int i=0;i<array.length;i++){
                out.write(array[i]);
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static void read(String message){
        try (var reader=new FileInputStream(message)){
            var a=new Container();
            var readed=0;
            while ((readed=reader.read())!=-1){
                a.add(readed);
            }
            System.out.println(a.getData());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static class Container{
        private byte[] data={};
        void add(Number b){
            data= Arrays.copyOf(data,data.length+1);
            data[data.length-1]=b.byteValue();
        }
        public String getData(){
            return new String(data);
        }
    }
}
