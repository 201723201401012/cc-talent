package cc.insistor.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @program: cc-talent
 * @description: 经纪人切面
 * @packagename: cc.insistor.aspect
 * @author: cc
 * @date: 2020-12-11 01:50
 **/
@Aspect
@Component
public class BrokerAspect {

    /**
     * 定义切入点，切入点为cc.insistor.api.test.AopController中的所有方法
     *通过@Pointcut注解声明频繁使用的切点表达式
     */
    @Pointcut("execution(public * cc.insistor.api.test.AopController.*(..)))")
    public void BrokerAspect(){
    }

    /**
     * @description  在连接点执行之前执行的通知
     */
    @Before("BrokerAspect()")
    public void doBeforeGame(){
        System.out.println("经纪人正在处理球星赛前事务！");
    }

    /**
     * @description  在连接点执行之后执行的通知（返回通知和异常通知的异常）
     */
    @After("BrokerAspect()")
    public void doAfterGame(){
        System.out.println("经纪人为球星表现疯狂鼓掌！");
    }

    /**
     * @description  在连接点执行之后执行的通知（返回通知）
     */
    @AfterReturning("BrokerAspect()")
    public void doAfterReturningGame(){
        System.out.println("返回通知：经纪人为球星表现疯狂鼓掌！");
    }

    /**
     * @description  在连接点执行之后执行的通知（异常通知）
     */
    @AfterThrowing("BrokerAspect()")
    public void doAfterThrowingGame(){
        System.out.println("异常通知：球迷要求退票！");
    }

    /**
     * @description  使用环绕通知
     */
    @Around("BrokerAspect()")
    public void doAroundGame(ProceedingJoinPoint pjp) throws Throwable {
        try{
            System.out.println("经纪人正在处理球星赛前事务！");
            pjp.proceed();
            System.out.println("返回通知：经纪人为球星表现疯狂鼓掌！");
        }
        catch(Throwable e){
            System.out.println("异常通知：球迷要求退票！");
        }
    }
}