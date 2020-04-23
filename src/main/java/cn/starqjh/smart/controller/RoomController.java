package cn.starqjh.smart.controller;

import cn.starqjh.smart.bean.Room;
import cn.starqjh.smart.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("room")
public class RoomController {
    @Autowired
    RoomService roomService;

    @GetMapping("all_room")
    @ResponseBody
    public List<Room> getAllRoom(){
        return roomService.getAllRoom();
    }
}
