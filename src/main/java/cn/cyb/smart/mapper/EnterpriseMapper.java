package cn.cyb.smart.mapper;

import cn.cyb.smart.bean.Build;
import cn.cyb.smart.bean.Enterprise;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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

    @Update("update enterprise_t set enterprise_le=#{enterpriseLe},contract_number=#{contractNumber},contact=#{contact},person_number=#{personNumber},contact_phone=#{contactPhone}" +
            " where enterprise_id=#{enterpriseId}")
    int editEnterprise(Enterprise enterprise);

    @Update("update enterprise_t set leave_reason=#{leaveReason},use_state=0,leave_time=NOW()" +
            " where enterprise_id=#{enterpriseId}")
    int undoEnterprise(Enterprise enterprise);
}
