package com.ysh.service;

import com.ysh.model.YshUser;

import java.util.List;

public interface YshUserService {
    List<YshUser> findAll();
    void insert(YshUser yshUser);
}
