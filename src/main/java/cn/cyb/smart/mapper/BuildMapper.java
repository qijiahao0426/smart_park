package cn.cyb.smart.mapper;

import cn.cyb.smart.bean.Build;
import org.apache.ibatis.annotations.*;
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

    @Insert("insert into build_t(build_name,build_number,build_floor,build_area,build_type,park_id)" +
            "values(#{buildName},#{buildNumber},#{buildFloor},#{buildArea},#{buildType}," +
            "(select park_id from park_t where park_name=#{parkName}))")
    int activate(Build build);

    @Update("update build_t set build_name=#{buildName},build_number=#{buildNumber},build_floor=#{buildFloor},build_area=#{buildArea},build_type=#{buildType}" +
            "park_id=(select park_id from park_t where park_name=#{parkName}) where build_name=#{buildName}")
    int editBuild(Build build);
}
