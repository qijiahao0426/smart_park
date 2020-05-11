package cn.cyb.smart.controller;

import cn.cyb.smart.bean.Build;
import cn.cyb.smart.bean.Room;
import cn.cyb.smart.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("rooms_in_build")
    @ResponseBody
    public List<Room> getRoomByBuild(@RequestParam int buildId){
        System.out.println(roomService.getRoomByBuild(buildId).toString());
        return roomService.getRoomByBuild(buildId);
    }
    @GetMapping("edit_room")
    @ResponseBody
    public int editRoom(Room room){
        if(roomService.editRoom(room)>0)
            return 7;
        return 0;
    }

    @GetMapping("activate_room")
    @ResponseBody
    public int activateRoom(Room room){
        if(roomService.activate_room(room)>0)
            return 7;
        return 0;
    }
}
