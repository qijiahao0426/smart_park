package cn.starqjh.smart.controller;

import cn.starqjh.smart.bean.User;
import cn.starqjh.smart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
