package com.ysh.test.logJDKService;

import org.apache.ibatis.annotations.Param;

import java.lang.reflect.Method;

/**
 * 个人日志类接口
 */
public interface MyLogger {
    /**
     * 记录进入方法时间
     */
    void saveIntoMethodTime(@Param("method") Method method);

    /**
     * 记录方法退出时间
     */
    void saveOutMethodTime(Method method);
}
