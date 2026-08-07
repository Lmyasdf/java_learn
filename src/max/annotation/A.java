package max.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD ,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)//一直保留到运行阶段
public @interface A {
    public String name() default "";
    String[] address() default {};
}
