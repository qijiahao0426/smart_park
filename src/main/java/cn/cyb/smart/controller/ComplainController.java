package cn.cyb.smart.controller;

import cn.cyb.smart.bean.Complain;
import cn.cyb.smart.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("complain")
public class ComplainController {
    @Autowired
    ComplainService complainService;
    @GetMapping("complain")
    List<Complain> getAllComplain(){
        return complainService.getAllComplain();
    }

    @GetMapping("response")
    int response(int complainId,String response){
        if(complainService.response(complainId,response)>0)
            return 7;
        return 0;
    }

    @GetMapping("suggest")
    List<Complain> getAllSuggest(){
        return complainService.getAllSuggest();
    }

    @GetMapping("responseS")
    int responseS(int complainId,String response){
        if(complainService.response(complainId,response)>0)
            return 7;
        return 0;
    }
}
