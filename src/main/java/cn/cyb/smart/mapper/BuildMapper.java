package cn.cyb.smart.mapper;

import cn.cyb.smart.bean.Build;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface BuildMapper {
    @Select("SELECT b.*,p.park_name\n" +
            "FROM build_t b \n" +
            "LEFT JOIN park_t p ON p.park_id=b.park_id")
    @ResultType(Build.class)
    List<Build> getAllBuild();
}
