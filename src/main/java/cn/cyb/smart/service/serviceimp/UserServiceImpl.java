package cn.cyb.smart.service.serviceimp;

import cn.cyb.smart.bean.Role;
import cn.cyb.smart.bean.User;
import cn.cyb.smart.mapper.UserMapper;
import cn.cyb.smart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getUser(String userId) {
        return (User)userMapper.getUser(userId);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public List<Role> getAllRole() {
        return userMapper.getAllRole();
    }
}
