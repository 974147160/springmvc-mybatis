package com.ysh.proxy;

import com.ysh.annotation.MyAnnotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 日志拦截类（切面）
 */
@Aspect
@Component
public class LogInterceptor {
    @Before(value = "execution(* com.ysh.controller.*.*(..))")
    public void before(JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        System.out.println("【前置通知】进入"+methodName+"方法时间为：" + System.currentTimeMillis() + "begin with:" + Arrays.asList(jp.getArgs()));
        //getClassString();
        //getFunString();
    }

    @After(value = "execution(* com.ysh.controller.*.*(..))")
    public void after() {
        System.out.println("【后置通知】退出方法时间为：" + System.currentTimeMillis());
        //getClassString();
        //getFunString();
    }

    @Around(value = "execution(* com.ysh.controller.*.*(..))")
    public Object Around(ProceedingJoinPoint point) throws Throwable{
        System.out.println("ANNOTATION welcome");
        System.out.println("ANNOTATION 调用方法："+ point.getSignature().getName());
        System.out.println("ANNOTATION 调用类：" + point.getSignature().getDeclaringTypeName());
        System.out.println("ANNOTATION 调用类名" + point.getSignature().getDeclaringType().getSimpleName());
        //调用目标方法
        Object object = point.proceed();
        System.out.println("ANNOTATION login success");
        return object;
    }

    @Around("@annotation(around)")
    public String Around(ProceedingJoinPoint point, MyAnnotation around) throws Throwable{
        System.out.println("ANNOTATION welcome");
        System.out.println("ANNOTATION 调用方法："+ around.methodName());
        System.out.println("ANNOTATION 调用类：" + point.getSignature().getDeclaringTypeName());
        System.out.println("ANNOTATION 调用类名" + point.getSignature().getDeclaringType().getSimpleName());
        //如果controller方法有返回值，则around必须返回相同的返回值，用超类Object接受，然后强转
        Object object = point.proceed();
        System.out.println("ANNOTATION login success");
        return (String)object;
    }

    @AfterReturning(value = "execution(* com.ysh.controller.*.*(..))", returning = "result")
    public void AfterReturningMethod(JoinPoint jp, Object result) {
        String methodName = jp.getSignature().getName();
        System.out.println("【返回通知】" + methodName+ " 方法时间为：" + System.currentTimeMillis());
    }

    @AfterThrowing(value = "execution(* com.ysh.controller.*.*(..))", throwing = "e")
    public void AfterThrowingMethod(JoinPoint jp, NullPointerException  e) {
        String methodName = jp.getSignature().getName();
        System.out.println("【异常通知】" + methodName+ " 方法时间为：" + System.currentTimeMillis() + " occurs exception:" + e);
    }

    private static void getClassString() {
        // 获取当前线程
        Thread thread = Thread.currentThread();
        // 获取当前线程的栈快照(入栈方法的数据)
        StackTraceElement[] trace = thread.getStackTrace();
        // 获取当前方法所在的类名
        String methodName = trace[1].getClassName();
        System.out.println("当前类名为：" + methodName);
    }

    private static void getFunString() {
        // 获取当前线程
        Thread thread = Thread.currentThread();
        // 获取当前线程的栈快照(入栈方法的数据)
        StackTraceElement[] trace = thread.getStackTrace();
        // 获取当前方法的文件名
        System.out.println(trace[1].getFileName());
        // 获取当前方法的行号
        System.out.println(trace[1].getLineNumber());
        // 获取当前方法的名称
        System.out.println(trace[1].getMethodName());
    }
}
