package cc.insistor.annotation;

import java.lang.annotation.*;

/**
 * @program: cc-talent
 * @description: 自定义日志注解
 * @packagename: cc.insistor.annotation
 * @author: cc
 * @date: 2020-12-11 02:33
 **/
@Target(ElementType.METHOD) //注解放置的目标位置,METHOD是可注解在方法级别上
@Retention(RetentionPolicy.RUNTIME) //注解在哪个阶段执行
@Documented
public @interface WebLog {
    String description() default "";
}
