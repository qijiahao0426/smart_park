package cn.cyb.smart.service;

import cn.cyb.smart.bean.Build;

import java.util.List;

public interface BuildService {
    List<Build> getAllBuild();
    int activate(Build build);
    int editBuild(Build build);
}
