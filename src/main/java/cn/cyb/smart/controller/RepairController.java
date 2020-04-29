package cn.cyb.smart.controller;

import cn.cyb.smart.bean.Repair;
import cn.cyb.smart.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("repair")
public class RepairController {
    @Autowired
    RepairService repairService;

    @GetMapping("repair")
    List<Repair> getAllUnRepair(){
        return repairService.getAllRepair();
    }
}
