package com.ysh.dao;

import com.ysh.model.YshUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YshUserDao {
    List<YshUser> findAll();
    void insert(YshUser yshUser);
}
