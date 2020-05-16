package cn.cyb.smart.service;

import cn.cyb.smart.bean.Role;
import cn.cyb.smart.bean.User;

import java.util.List;

public interface UserService {
    User getUser(String userId);
    List<User> getAllUser();
    List<Role> getAllRole();

}
