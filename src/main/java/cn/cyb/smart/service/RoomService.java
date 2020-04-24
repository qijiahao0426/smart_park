package cn.cyb.smart.service;

import cn.cyb.smart.bean.Room;

import java.util.List;

public interface RoomService {
    List<Room> getAllRoom();
    List<Room> getRoomByBuild(int buildId);
}
