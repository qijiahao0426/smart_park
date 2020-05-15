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
    public List<ResourceApplication> getAllUsed() {
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

    @Override
    public int create(Resource resource) {
        return resourceMapper.create(resource);
    }

    @Override
    public int agree(ResourceApplication resourceApplication) {
        if(resourceMapper.createApp(resourceApplication)>0)
        return resourceMapper.agree(resourceApplication);
        return 0;
    }

    @Override
    public int _break(Resource resource) {
        return resourceMapper._break(resource);
    }

    @Override
    public int back(ResourceApplication resourceApplication) {
        if(resourceMapper.deleteApp(resourceApplication)>0){
            return resourceMapper.back(resourceApplication);
        }
        return 0;
    }

    @Override
    public int start(ResourceApplication resourceApplication) {
        return resourceMapper.start(resourceApplication);
    }

}
