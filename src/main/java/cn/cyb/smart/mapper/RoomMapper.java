package cn.cyb.smart.mapper;

import cn.cyb.smart.bean.Build;
import cn.cyb.smart.bean.Room;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoomMapper {
    @Select("SELECT r.room_name,r.rent_type,r.room_area,r.room_high,r.room_price,r.room_state,r.time_to_use,e.enterprise_name,b.build_name,p.park_name,p.area,p.trade_state\n" +
            "FROM room_t r \n" +
            "LEFT JOIN enterprise_t e on r.enterprise=e.enterprise_id\n" +
            "LEFT JOIN build_t b on r.build_id=b.build_id\n" +
            "LEFT JOIN park_t p on p.park_id=b.park_id")
    @ResultType(Room.class)
    List<Room> getAllRoom();

    @Select("SELECT r.room_name,r.rent_type,r.room_area,r.room_high,r.room_price,r.room_state,r.time_to_use,e.enterprise_name,b.build_name,p.park_name,p.area,p.trade_state\n" +
            "FROM room_t r \n" +
            "LEFT JOIN enterprise_t e on r.enterprise=e.enterprise_id\n" +
            "LEFT JOIN build_t b on r.build_id=b.build_id\n" +
            "LEFT JOIN park_t p on p.park_id=b.park_id\n" +
            "WHERE r.build_id=#{buildId}")
    @ResultType(Room.class)
    List<Room> getRoomByBuild(int buildId);

    @Update("update room_t set room_price=#{roomPrice},room_state=#{roomState},rent_type=#{rentType}" +
            ",enterprise=(select enterprise_id from enterprise_t where enterprise_name=#{enterpriseName})" +
            " where room_name=#{roomName}")
    int editRoom(Room room);

    @Insert("insert into room_t(room_high,room_area,rent_type,room_price,room_state,time_to_use,enterprise,build_id,room_name)" +
            "values(#{roomHigh},#{roomArea},#{rentType},#{roomPrice},#{roomState},#{timeToUse}," +
            "(select enterprise_id from enterprise_t where enterprise_name=#{enterpriseName})," +
            "(select build_id from build_t where build_name=#{buildName}),#{roomName})")
    int activate_room(Room room);
}
