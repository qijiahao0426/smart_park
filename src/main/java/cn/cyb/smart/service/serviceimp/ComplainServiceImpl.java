package cn.cyb.smart.service.serviceimp;

import cn.cyb.smart.bean.Complain;
import cn.cyb.smart.mapper.ComplainMapper;
import cn.cyb.smart.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ComplainServiceImpl implements ComplainService {
    @Autowired
    ComplainMapper complainMapper;
    @Override
    public List<Complain> getAllComplain() {
        return complainMapper.getAllComplain();
    }

    @Override
    public List<Complain> getAllSuggest() {
        return complainMapper.getAllSuggest();
    }
}
