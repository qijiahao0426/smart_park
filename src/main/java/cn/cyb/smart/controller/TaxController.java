package cn.cyb.smart.controller;

import cn.cyb.smart.bean.Push;
import cn.cyb.smart.bean.unPush;
import cn.cyb.smart.service.TaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tax")
public class TaxController {
    @Autowired
    TaxService taxService;

    @GetMapping("push")
    @ResponseBody
    List<Push> getAllPush(){
        return taxService.getAllPush();
    }

    @GetMapping("un_push")
    @ResponseBody
    List<unPush> getAllUnPush(){
        return taxService.getAllUnPush();
    }
}
