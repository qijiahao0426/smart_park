package cn.cyb.smart.service.serviceimp;

import cn.cyb.smart.bean.Room;
import cn.cyb.smart.mapper.RoomMapper;
import cn.cyb.smart.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    RoomMapper roomMapper;
    @Override
    public List<Room> getAllRoom() {
        return  roomMapper.getAllRoom();
    }

    @Override
    public List<Room> getRoomByBuild(int buildId) {
        return roomMapper.getRoomByBuild(buildId);
    }
}
