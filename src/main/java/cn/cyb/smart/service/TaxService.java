package cn.cyb.smart.service;

import cn.cyb.smart.bean.Push;
import cn.cyb.smart.bean.unPush;

import java.util.List;

public interface TaxService {
    List<Push> getAllPush();
    List<unPush> getAllUnPush();

}
