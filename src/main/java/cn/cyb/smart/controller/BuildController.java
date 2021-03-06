package cn.cyb.smart.controller;

import cn.cyb.smart.bean.Build;
import cn.cyb.smart.service.BuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("build")
public class BuildController {
    @Autowired
    BuildService buildService;

    @GetMapping("all_build")
    @ResponseBody
    List<Build> getAllBuild(){
        return buildService.getAllBuild();
    }

    @GetMapping("activate")
    @ResponseBody
    public int activate(Build build){
        if(buildService.activate(build)>0)
            return 7;
        return 0;
    }
    @GetMapping("edit_build")
    @ResponseBody
    public int editBuild(Build build){
        if(buildService.editBuild(build)>0)
            return 7;
        return 0;
    }
}
