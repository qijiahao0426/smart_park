package cn.cyb.smart.controller;

import cn.cyb.smart.bean.Enterprise;
import cn.cyb.smart.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("enterprise")
public class EnterpriseController {
    @Autowired
    EnterpriseService enterpriseService;

    @GetMapping("all_enterprise")
    @ResponseBody
    List<Enterprise> getAllEnterprise(){
        return enterpriseService.getAllEnterprise();
    }
}
