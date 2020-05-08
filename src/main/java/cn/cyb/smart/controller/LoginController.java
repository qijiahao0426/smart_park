package cn.cyb.smart.controller;

import cn.cyb.smart.bean.User;
import cn.cyb.smart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
@ResponseBody
public class LoginController {
    @Autowired
    UserService userService;
    @PostMapping
    public int login(@RequestParam String userId,@RequestParam String password){
        User user=userService.getUser(userId);
        if(user.getUserPassword().equals(password)) return 777;
        return 999;
    }
}
