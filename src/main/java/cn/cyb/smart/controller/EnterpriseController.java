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

    @GetMapping("edit_enterprise")
    @ResponseBody
    int editEnterprise(Enterprise enterprise){
        if(enterpriseService.editEnterprise(enterprise)>0)
            return 7;
        return 0;
    }

    @GetMapping("undo_enterprise")
    @ResponseBody
    int undoEnterprise(Enterprise enterprise){
        if(enterpriseService.undoEnterprise(enterprise)>0)
            return 7;
        return 0;    }
}
