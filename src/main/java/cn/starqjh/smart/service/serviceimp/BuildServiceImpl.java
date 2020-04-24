package cn.starqjh.smart.service.serviceimp;

import cn.starqjh.smart.bean.Build;
import cn.starqjh.smart.mapper.BuildMapper;
import cn.starqjh.smart.service.BuildService;
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
}
