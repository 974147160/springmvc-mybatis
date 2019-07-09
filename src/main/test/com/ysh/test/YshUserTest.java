package com.ysh.test;

import com.ysh.dao.YshUserDao;
import com.ysh.model.YshUser;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class YshUserTest extends BaseJunit4Test {

    @Resource(name = "yshUserDao")
    private YshUserDao yshUserDao;

    @Test
    public void testYshUser(){
        List<YshUser> yshUserList = yshUserDao.findAll();
        System.out.println(yshUserList.size());
    }
}
