package cn.cyb.smart.service.serviceimp;

import cn.cyb.smart.bean.Enterprise;
import cn.cyb.smart.mapper.EnterpriseMapper;
import cn.cyb.smart.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {
    @Autowired
    EnterpriseMapper enterpriseMapper;
    @Override
    public List<Enterprise> getAllEnterprise() {
        return enterpriseMapper.getAllEnterprise();
    }
}
