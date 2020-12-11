package cc.insistor.annotation;

import java.lang.annotation.*;

/**
 * @program: cc-talent
 * @description: 自定义操作日志注解
 * @packagename: cc.insistor.annotation
 * @author: cc
 * @date: 2020-12-11 02:14
 **/
@Target(ElementType.METHOD) //注解放置的目标位置,METHOD是可注解在方法级别上
@Retention(RetentionPolicy.RUNTIME) //注解在哪个阶段执行
@Documented
public @interface OperatorLog {
    String operatorModel() default ""; // 操作模块
    String operatorType() default "";  // 操作类型
    String operatorDesc() default "";  // 操作说明
}
