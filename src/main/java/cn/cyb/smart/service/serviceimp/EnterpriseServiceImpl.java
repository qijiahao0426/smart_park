package cn.cyb.smart.service.serviceimp;

import cn.cyb.smart.bean.Enterprise;
import cn.cyb.smart.mapper.EnterpriseMapper;
import cn.cyb.smart.mapper.RoomMapper;
import cn.cyb.smart.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {
    @Autowired
    EnterpriseMapper enterpriseMapper;
    @Autowired
    RoomMapper roomMapper;
    @Override
    public List<Enterprise> getAllEnterprise() {
        return enterpriseMapper.getAllEnterprise();
    }

    @Override
    public int editEnterprise(Enterprise enterprise) {
        return enterpriseMapper.editEnterprise(enterprise);
    }

    @Override
    public int undoEnterprise(Enterprise enterprise) {
        System.out.println(enterprise.getRoomName());
        roomMapper.undoEnterprise(enterprise.getRoomName());
        if(enterpriseMapper.undoEnterprise(enterprise)>0)
            return 7;
        return -1;
    }
}
