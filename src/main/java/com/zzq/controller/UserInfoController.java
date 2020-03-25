package com.zzq.controller;

import com.zzq.po.UserInfo;
import com.zzq.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/add")
    @ResponseBody
    public Object add() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("zhangzq");
        userInfo.setPassword("pkusoft");
        userInfo.setTitle("javaer,小菜鸟");
        int i = this.userInfoService.insert(userInfo);
        return i;
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public Object getAll() {
        return this.userInfoService.getAll();
    }

}
