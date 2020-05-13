package cn.cyb.smart.service;

import cn.cyb.smart.bean.Repair;

import java.util.List;

public interface RepairService {
    List<Repair> getAllRepair();
    int receiveRepair(int repairId);
    int rejectRepair(int repairId);

}
