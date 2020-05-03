package cn.cyb.smart.controller;

import cn.cyb.smart.bean.Resource;
import cn.cyb.smart.bean.ResourceApplication;
import cn.cyb.smart.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("resource")
@ResponseBody
public class ResourceController {
    @Autowired
    ResourceService resourceService;
    @GetMapping("r_used")
    public List<Resource> getAllUsed() {
        return resourceService.getAllUsed();
    }
    @GetMapping("r_free")
    public List<Resource> getAllFree() {
        return resourceService.getAllFree();
    }
    @GetMapping("r_break")
    public List<Resource> getAllBreak() {
        return resourceService.getAllBreak();
    }
    @GetMapping("will_out_time")
    public List<ResourceApplication> getAllWillOutTime(){
        return resourceService.getAllWillOutTime();
    }


}
