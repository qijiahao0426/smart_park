package cn.cyb.smart.mapper;

import cn.cyb.smart.bean.Complain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ComplainMapper {
    @Select("SELECT c.*,e.enterprise_name\n" +
            "FROM complain_t c \n" +
            "LEFT JOIN enterprise_t e ON e.enterprise_id=c.enterprise_id\n" +
            "WHERE c.type=1")
    @ResultType(Complain.class)
    List<Complain> getAllComplain();
    @Select("SELECT c.*,e.enterprise_name\n" +
            "FROM complain_t c \n" +
            "LEFT JOIN enterprise_t e ON e.enterprise_id=c.enterprise_id\n" +
            "WHERE c.type=0")
    @ResultType(Complain.class)
    List<Complain> getAllSuggest();

    @Update("update complain_t set response=#{response} where complain_id=#{complainId}")
    int response(int complainId,String response);
}
