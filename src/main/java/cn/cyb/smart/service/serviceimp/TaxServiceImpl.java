package cn.cyb.smart.service.serviceimp;

import cn.cyb.smart.bean.Push;
import cn.cyb.smart.bean.unPush;
import cn.cyb.smart.mapper.TaxMapper;
import cn.cyb.smart.service.TaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaxServiceImpl implements TaxService {
    @Autowired
    TaxMapper taxMapper;
    @Override
    public List<Push> getAllPush() {
        return taxMapper.getAllPush();
    }

    @Override
    public List<unPush> getAllUnPush() {
        return taxMapper.getAllUnPush();
    }
}
