package cn.cyb.smart.controller;

import cn.cyb.smart.bean.User;
import cn.cyb.smart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("info")
    @ResponseBody
    public User getUser(String userId){
        User user=userService.getUser(userId);
        return user;
    }
}
