package com.geek.guiyu;

import com.geek.guiyu.domain.model.UserInfo;
import com.geek.guiyu.service.UserService;
import com.geek.guiyu.service.util.ShortMessageUtil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GuiyuApplicationTests {
    @Autowired
    ShortMessageUtil shortMessageUtil;
    @Autowired
    UserService userService;
    @Test
    public void test() {
        shortMessageUtil.sendShortMessage("15320263731");
    }
    @Test
    public void testrandom(){
        double random = Math.random() * 1000000;
        System.out.println(String.valueOf((int)random));
    }
    @Test
    public void editUserInfoTest(){
        UserInfo userInfo = new UserInfo();
        userInfo.setPhone("123");
    }

}
