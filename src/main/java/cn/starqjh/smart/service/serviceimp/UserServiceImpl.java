package cn.starqjh.smart.service.serviceimp;

import cn.starqjh.smart.bean.User;
import cn.starqjh.smart.mapper.UserMapper;
import cn.starqjh.smart.service.UserService;
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
