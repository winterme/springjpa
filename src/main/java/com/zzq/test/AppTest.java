package com.zzq.test;

import com.zzq.po.UserInfo;
import com.zzq.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    private static final Logger log = LoggerFactory.getLogger(AppTest.class);


    @Autowired(  )
    private UserInfoService userInfoService;

    @Test
    public void testJpa(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("zhangzq");
        userInfo.setPassword("pkusoft");
        userInfo.setTitle("javaer,小菜鸟");
        int i = this.userInfoService.insert(userInfo);
        System.out.println( i );
    }

}
