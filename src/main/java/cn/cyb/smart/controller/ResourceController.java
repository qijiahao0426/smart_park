package cn.cyb.smart.controller;

import cn.cyb.smart.bean.Build;
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
    public List<ResourceApplication> getAllUsed() {
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

    @GetMapping("create")
    @ResponseBody
    public int create(Resource resource){
        if(resourceService.create(resource)>0)
            return 7;
        return 0;
    }

    @GetMapping("break")
    @ResponseBody
    public int _break(Resource resource){
        if(resourceService._break(resource)>0)
            return 7;
        return 0;
    }

    @GetMapping("agree")
    @ResponseBody
    public int agree(ResourceApplication resource){
        if(resourceService.agree(resource)>0)
            return 7;
        return 0;
    }

    @GetMapping("back")
    @ResponseBody
    public int back(ResourceApplication resourceApplication){
        if(resourceService.back(resourceApplication)>0)
            return 7;
        return 0;
    }

    @GetMapping("start")
    @ResponseBody
    public int start(ResourceApplication resourceApplication){
        if(resourceService.start(resourceApplication)>0)
            return 7;
        return 0;
    }
}
