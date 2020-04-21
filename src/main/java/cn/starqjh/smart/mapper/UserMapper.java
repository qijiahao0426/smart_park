package cn.starqjh.smart.mapper;

import cn.starqjh.smart.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    @Select("select * from `user_t` where `user_id`= #{userId}")
    @ResultType(User.class)
    User getUser(String userId);
}
