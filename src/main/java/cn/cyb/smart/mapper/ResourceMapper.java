package cn.cyb.smart.mapper;

import cn.cyb.smart.bean.Resource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ResourceMapper {
    @Select("SELECT *\n" +
            "FROM resource_t \n" +
            "WHERE state=0")
    @ResultType(Resource.class)
    List<Resource> getAllUsed();

    @Select("SELECT *\n" +
            "FROM resource_t \n" +
            "WHERE state=1")
    @ResultType(Resource.class)
    List<Resource> getAllFree();

    @Select("SELECT *\n" +
            "FROM resource_t \n" +
            "WHERE state=2")
    @ResultType(Resource.class)
    List<Resource> getAllBreak();

}
