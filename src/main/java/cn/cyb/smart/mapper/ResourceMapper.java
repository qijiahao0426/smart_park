package cn.cyb.smart.mapper;

import cn.cyb.smart.bean.Resource;
import cn.cyb.smart.bean.ResourceApplication;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ResourceMapper {
    @Select("SELECT r.*,ra.begin_time,ra.end_time,e.enterprise_name\n" +
            "FROM resource_t r \n" +
            "LEFT JOIN res_app_t ra ON ra.resource_id=r.resource_id\n" +
            "LEFT JOIN enterprise_t e ON e.enterprise_id=ra.enterprise_id\n" +
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
    @Select("SELECT *,DATEDIFF(ra.end_time,NOW()) AS dd \n" +
            "FROM res_app_t ra \n" +
            "LEFT JOIN resource_t r ON ra.resource_id=r.resource_id\n" +
            "LEFT JOIN enterprise_t e ON e.enterprise_id=ra.enterprise_id\n" +
            "WHERE DATEDIFF(ra.end_time,NOW())<=30")
    @ResultType(ResourceApplication.class)
    List<ResourceApplication> getAllWillOutTime();

}
