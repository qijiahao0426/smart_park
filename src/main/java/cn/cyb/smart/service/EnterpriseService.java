package cn.cyb.smart.service;

import cn.cyb.smart.bean.Enterprise;

import java.util.List;

public interface EnterpriseService {
    List<Enterprise> getAllEnterprise();
    int editEnterprise(Enterprise enterprise);
    int undoEnterprise(Enterprise enterprise);

}
