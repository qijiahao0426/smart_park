package cn.cyb.smart.mapper;

import cn.cyb.smart.bean.Enterprise;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.hibernate.validator.constraints.URL;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EnterpriseMapper {
    @Select("SELECT e.*,r.room_name\n" +
            "FROM enterprise_t e\n" +
            "LEFT JOIN room_t r ON r.enterprise=e.enterprise_id")
    @ResultType(Enterprise.class)
    List<Enterprise> getAllEnterprise();
}
