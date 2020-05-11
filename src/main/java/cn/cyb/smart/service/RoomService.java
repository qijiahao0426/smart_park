package cn.cyb.smart.service;

import cn.cyb.smart.bean.Room;

import java.util.List;

public interface RoomService {
    List<Room> getAllRoom();
    List<Room> getRoomByBuild(int buildId);
    int editRoom(Room room);
    int activate_room(Room room);

}
