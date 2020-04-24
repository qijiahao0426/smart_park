package cn.cyb.smart.service.serviceimp;

import cn.cyb.smart.bean.User;
import cn.cyb.smart.mapper.UserMapper;
import cn.cyb.smart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getUser(String userId) {
        return (User)userMapper.getUser(userId);
    }
}
