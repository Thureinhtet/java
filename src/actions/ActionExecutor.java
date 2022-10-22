package actions;

import java.lang.reflect.Method;

public class ActionExecutor {
    static void execute(Action action,String message) throws NoSuchMethodException {
        if (null==message){
            Method invoke=action.getClass().getMethod("invoke", String.class);
            DefaultMessage defaultMessage=invoke.getAnnotation(DefaultMessage.class);
            if (null!=defaultMessage){
                action.invoke(defaultMessage.value());
            }
        }else{
            action.invoke(message);
        }
    }
    public static void main(String[] args) throws NoSuchMethodException {
        Action action=new OutAction();
        execute(action,null);
        execute(action,"Hello Welcome");
    }
}
