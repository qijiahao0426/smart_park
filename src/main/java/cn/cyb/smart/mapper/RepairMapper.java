package cn.cyb.smart.mapper;

import cn.cyb.smart.bean.Repair;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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

    @Update("update repair_t set repair_state=1" +
            " where repair_id=#{repairId}")
    int receiveRepair(int repairId);

    @Update("update repair_t set repair_state=-1" +
            " where repair_id=#{repairId}")
    int rejectRepair(int repairId);
}
