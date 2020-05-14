package cn.cyb.smart.service;

import cn.cyb.smart.bean.Complain;

import java.util.List;

public interface ComplainService {
    List<Complain> getAllComplain();
    List<Complain> getAllSuggest();
    int response(int complainId,String response);

}
