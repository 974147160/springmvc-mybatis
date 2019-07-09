package com.ysh.test.logJDKService;

import java.lang.reflect.Method;

public class MyLoggerImpl implements MyLogger {

    public void saveIntoMethodTime(Method method){
        System.out.println("进入" + method.getName() + "方法时间为："+ System.currentTimeMillis());
    }

    public void saveOutMethodTime(Method method){
        System.out.println("退出" + method.getName() + "方法时间为：" + System.currentTimeMillis());
    }
}
