package actions;

import java.lang.annotation.Documented;

interface Action{
    void invoke(String message);
}