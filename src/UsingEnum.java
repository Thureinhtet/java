public class UsingEnum {
    public static void main(String[] args) {
       for (Days d:Days.values()){
           d.log();
           showDay(d);
       }
    }
    static void showDay(Days day){
        System.out.println(day);
        System.out.println(day.getViewName());
    }
}
interface Loggable{
    void log();
}
enum Days implements Loggable{
     SUM("Sunday"){

     },
     MON("Monday"){
     },
     TUE("Tuesday"){

     },
     WED("Wednesday"){

     },
     THU("Thursday"){

     },
     FRI("Friday"){

     },
     SAT("Saturday");
     private String viewName;
     public void log(){
        System.out.println("hello today is  "+viewName);
     }
     Days(String viewName){
        this.viewName=viewName;
     }

    public String getViewName() {
        return viewName;
    }

    @Override
    public String toString() {
        return getViewName();
    }
}