package cn.cyb.smart.service.serviceimp;

import cn.cyb.smart.bean.Resource;
import cn.cyb.smart.bean.ResourceApplication;
import cn.cyb.smart.mapper.ResourceMapper;
import cn.cyb.smart.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ResourceServiceImpl implements ResourceService {
    @Autowired
    ResourceMapper resourceMapper;
    @Override
    public List<Resource> getAllUsed() {
        return resourceMapper.getAllUsed();
    }

    @Override
    public List<Resource> getAllFree() {
        return resourceMapper.getAllFree();
    }

    @Override
    public List<Resource> getAllBreak() {
        return resourceMapper.getAllBreak();
    }

    @Override
    public List<ResourceApplication> getAllWillOutTime() {
        return resourceMapper.getAllWillOutTime();
    }

}
