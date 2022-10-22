package actions;

public class OutAction implements Action{
    @Override
    @DefaultMessage()
    public void invoke(String message) {
        System.out.println("Output Action: "+message);
    }
}
