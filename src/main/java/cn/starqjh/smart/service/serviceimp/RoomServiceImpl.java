package cn.starqjh.smart.service.serviceimp;

import cn.starqjh.smart.bean.Room;
import cn.starqjh.smart.mapper.RoomMapper;
import cn.starqjh.smart.service.RoomService;
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
}
