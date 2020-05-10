package cn.cyb.smart.controller;

import cn.cyb.smart.bean.Park;
import cn.cyb.smart.service.serviceimp.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("park")
@ResponseBody
public class ParkController {
    @Autowired
    ParkService parkService;
    @GetMapping
    public List<Park> getAllPark(){
        return parkService.getAllPark();
    }

}
