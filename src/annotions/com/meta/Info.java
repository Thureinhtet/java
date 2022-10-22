package annotions.com.meta;

import java.lang.annotation.Documented;

@Documented
public @interface Info{
    String owner();
    String group();
}