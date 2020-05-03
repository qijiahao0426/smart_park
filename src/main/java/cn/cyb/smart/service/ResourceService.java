package cn.cyb.smart.service;

import cn.cyb.smart.bean.Resource;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ResourceService {
    List<Resource> getAllUsed();
    List<Resource> getAllFree();
    List<Resource> getAllBreak();
}