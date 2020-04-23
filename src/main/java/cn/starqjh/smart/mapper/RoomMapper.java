package cn.starqjh.smart.mapper;

import cn.starqjh.smart.bean.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoomMapper {
    @Select("SELECT r.room_name,r.rent_type,r.room_area,r.room_high,r.room_price,r.room_state,r.time_to_use,e.enterprise_name,b.build_name\n" +
            "FROM room_t r LEFT JOIN enterprise_t e on r.enterprise=e.enterprise_id LEFT JOIN build_t b on r.build_id=b.build_id")
    @ResultType(Room.class)
    List<Room> getAllRoom();
}