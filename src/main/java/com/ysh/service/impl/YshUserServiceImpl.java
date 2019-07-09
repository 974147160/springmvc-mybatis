package com.ysh.service.impl;

import com.ysh.dao.YshUserDao;
import com.ysh.model.YshUser;
import com.ysh.service.YshUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class YshUserServiceImpl implements YshUserService {

    @Resource
    private YshUserDao yshUserDao;

    @Override
    public List<YshUser> findAll(){
        return yshUserDao.findAll();
    }

    @Override
    public void insert(YshUser yshUser){
        yshUserDao.insert(yshUser);
    }
}
