package cn.cyb.smart.service.serviceimp;

import cn.cyb.smart.bean.Repair;
import cn.cyb.smart.mapper.RepairMapper;
import cn.cyb.smart.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RepairServiceImpl implements RepairService {
    @Autowired
    RepairMapper repairMapper;
    @Override
    public List<Repair> getAllRepair() {
        return repairMapper.getAllRepair();
    }
}
