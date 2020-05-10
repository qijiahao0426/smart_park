package cn.cyb.smart.service.serviceimp;

import cn.cyb.smart.bean.Build;
import cn.cyb.smart.mapper.BuildMapper;
import cn.cyb.smart.service.BuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BuildServiceImpl implements BuildService {
    @Autowired
    BuildMapper buildMapper;
    @Override
    public List<Build> getAllBuild() {
        return buildMapper.getAllBuild();
    }

    @Override
    public int activate(Build build) {
        return buildMapper.activate(build);
    }

    @Override
    public int editBuild(Build build) {
        return buildMapper.editBuild(build);
    }
}
