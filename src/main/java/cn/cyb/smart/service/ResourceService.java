package cn.cyb.smart.service;

import cn.cyb.smart.bean.Resource;
import cn.cyb.smart.bean.ResourceApplication;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ResourceService {
    List<ResourceApplication> getAllUsed();
    List<Resource> getAllFree();
    List<Resource> getAllBreak();
    List<ResourceApplication> getAllWillOutTime();
    int create(Resource resource);
    int agree(ResourceApplication resourceApplication);
    int _break(Resource resource);
    int back(ResourceApplication resourceApplication);
    int start(ResourceApplication resourceApplication);

}
