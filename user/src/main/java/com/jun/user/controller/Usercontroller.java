package com.jun.user.controller;

import com.jun.user.domain.vo.UserVo;
import com.jun.user.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class Usercontroller {
    @Resource
    UserService userService;

    @RequestMapping("/list/{uid}")
    public UserVo list(@PathVariable int uid) throws Exception{
        return userService.getUservoByUid(uid);
    }
}
