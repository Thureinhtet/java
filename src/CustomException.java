public class CustomException {
    public static void main(String[] args) {

    }
    static void heightLevelMethod(){

    }
    public void middleMethod(int count){
        try {
            if (count<=0 && count>3){
                throw new MyAppException("Invalid count value");
            }
            for (int i=0;i<count;i++){
                lowlevelmethod();
            }
        }catch (Exception e){
            throw new MyAppException(e);
        }
    }
    public void lowlevelmethod() throws Exception{
        System.out.println("Hello Exception");
    }
}
class MyAppException extends RuntimeException{
    private boolean alert;
    MyAppException(String message){
        super(message);
        this.alert=true;
    }
    MyAppException(String message,Throwable cause){
        super(message,cause);
    }
    MyAppException(Throwable cause){
        super(cause);
    }

    public boolean isAlert() {
        return alert;
    }
}