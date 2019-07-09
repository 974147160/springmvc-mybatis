package com.ysh.controller;

import com.ysh.annotation.MyAnnotation;
import com.ysh.model.YshUser;
import com.ysh.service.YshUserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class YshUserController {

    private static final Log logger = LogFactory.getLog(YshUserController.class);

    @Resource
    private YshUserService yshUserService;

    @GetMapping("/findAll")
    @MyAnnotation(methodName = "findAll")
    public String findAll(Model model){
        List<YshUser> yshUserList = yshUserService.findAll();
        for(YshUser yshUser : yshUserList){
            System.out.println(yshUser.getId());
            System.out.println(yshUser.getName());
            logger.debug("1");
            logger.info("2");
            logger.warn("3");
            logger.error("4");
        }
        System.out.println("hello ljy");
        return "firstQuery";
    }

    @RequestMapping("/insert")
    public String insert(Model model){
        YshUser yshUser = new YshUser();
        yshUser.setName("train");
        yshUser.setPassword("123456");
        yshUserService.insert(yshUser);
        return "firstQuery";
    }

    @GetMapping("/test")
    public String test(Model model){
        System.out.println("hello ljy_test");
        return "firstQuery";
    }
}
