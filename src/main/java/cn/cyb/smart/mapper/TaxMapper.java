package cn.cyb.smart.mapper;

import cn.cyb.smart.bean.Push;
import cn.cyb.smart.bean.unPush;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TaxMapper {
    @Select("SELECT p.*,e.enterprise_name,e.person_number\n" +
            "FROM push_t p\n" +
            "LEFT JOIN enterprise_t e ON e.enterprise_id=p.enterprise_id")
    @ResultType(Push.class)
    List<Push> getAllPush();

    @Select("SELECT *\n" +
            "FROM enterprise_t e\n" +
            "WHERE e.enterprise_id NOT IN (SELECT p.enterprise_id FROM push_t p)")
    @ResultType(unPush.class)
    List<unPush> getAllUnPush();
}
