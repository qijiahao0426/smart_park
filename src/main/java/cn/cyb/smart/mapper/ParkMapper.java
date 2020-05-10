package cn.cyb.smart.mapper;

import cn.cyb.smart.bean.Park;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ParkMapper {
    @Select("select * from park_t")
    @ResultType(Park.class)
    List<Park> getAllPark();
}
