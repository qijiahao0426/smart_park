package cn.cyb.smart.service.serviceimp;

import cn.cyb.smart.bean.Park;
import cn.cyb.smart.mapper.ParkMapper;
import cn.cyb.smart.service.ParkServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ParkService implements ParkServiceImpl {
    @Autowired
    ParkMapper parkMapper;
    @Override
    public List<Park> getAllPark() {
        return parkMapper.getAllPark();
    }
}
