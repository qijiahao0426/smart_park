package cn.cyb.smart.mapper;

import cn.cyb.smart.bean.Repair;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RepairMapper {
    @Select("SELECT r.*,e.enterprise_name\n" +
            "FROM repair_t r\n" +
            "LEFT JOIN enterprise_t e ON e.enterprise_id=r.enterprise_id")
    @ResultType(Repair.class)
    List<Repair> getAllRepair();
}
