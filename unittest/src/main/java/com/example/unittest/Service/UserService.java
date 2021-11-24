package com.example.unittest.Service;

import com.example.unittest.Entity.User;
import org.springframework.stereotype.Service;

/**
 * FileName:UserService
 * Author:zhujinwei
 * Date: 2021年11月23日 0023 14:06:02
 */
@Service
public class UserService {
    public User getUserInfo()
    {
        User user=new User();
        user.setName("zhujinwei");
        user.setAge(22);
        return user;
    }
}
