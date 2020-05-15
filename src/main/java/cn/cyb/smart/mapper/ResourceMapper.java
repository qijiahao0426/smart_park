package cn.cyb.smart.mapper;

import cn.cyb.smart.bean.Build;
import cn.cyb.smart.bean.Resource;
import cn.cyb.smart.bean.ResourceApplication;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ResourceMapper {
    @Select("SELECT *,DATEDIFF(ra.end_time,NOW()) AS dd \n" +
            "FROM res_app_t ra \n" +
            "LEFT JOIN resource_t r ON ra.resource_id=r.resource_id\n" +
            "LEFT JOIN enterprise_t e ON e.enterprise_id=ra.enterprise_id")
    @ResultType(ResourceApplication.class)
    List<ResourceApplication> getAllUsed();

    @Select("SELECT *\n" +
            "FROM resource_t \n" +
            "WHERE state=1")
    @ResultType(Resource.class)
    List<Resource> getAllFree();

    @Select("SELECT *\n" +
            "FROM resource_t \n" +
            "WHERE state=0")
    @ResultType(Resource.class)
    List<Resource> getAllBreak();
    @Select("SELECT *,DATEDIFF(ra.end_time,NOW()) AS dd \n" +
            "FROM res_app_t ra \n" +
            "LEFT JOIN resource_t r ON ra.resource_id=r.resource_id\n" +
            "LEFT JOIN enterprise_t e ON e.enterprise_id=ra.enterprise_id\n" +
            "WHERE DATEDIFF(ra.end_time,NOW())<=30")
    @ResultType(ResourceApplication.class)
    List<ResourceApplication> getAllWillOutTime();

    @Insert("insert into resource_t(resource_name,resource_type,des,note,create_time)" +
            "values(#{resourceName},#{resourceType},#{des},#{note},NOW())")
    int create(Resource resource);

    @Update("update resource_t set state=2 where resource_id=#{resourceId}")
    int agree(Resource resource);

    @Update("update resource_t set state=0,stop_time=NOW() where resource_id=#{resourceId}")
    int _break(Resource resource);

    @Update("update resource_t set state=1 where resource_id=#{resourceId}")
    int back(ResourceApplication resourceApplication);

    @Update("update resource_t set state=1,stop_time=null,stop_reason=null where resource_id=#{resourceId}")
    int start(ResourceApplication resourceApplication);

    @Delete("delete from res_app_t where resource_id =#{resourceId} and enterprise_id=#{enterpriseId}")
    int deleteApp(ResourceApplication resourceApplication);

    @Insert("insert into res_app_t(enterprise_id,resource_id,begin_time,end_time)" +
            "values(#{enterpriseId},#{resourceId},NOW(),date_add(NOW(), interval 7 day))")
    int createApp(ResourceApplication resourceApplication);
}
