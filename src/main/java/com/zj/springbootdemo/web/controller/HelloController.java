package com.zj.springbootdemo.web.controller;

import com.zj.springbootdemo.model.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {

        UserInfo userInfo = new UserInfo();
        userInfo.setUname("ooo");

        return "Hello World~" + new Date();
    }

}
