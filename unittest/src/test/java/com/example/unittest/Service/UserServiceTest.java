package com.example.unittest.Service;

import com.example.unittest.Entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;

/**
 * FileName:UserServiceTest
 * Author:zhujinwei
 * Date: 2021年11月23日 0023 14:09:39
 */
@RunWith(SpringRunner.class)

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void getUserInfo()
    {
        User user=userService.getUserInfo();
        Assert.assertEquals(22,user.getAge());
        Assert.assertThat(user.getName(),is("zhujinwei"));
    }
}
