package cn.cyb.smart.service.serviceimp;

import cn.cyb.smart.bean.History;
import cn.cyb.smart.mapper.HistoryMapper;
import cn.cyb.smart.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HistoryServiceImpl implements HistoryService {
    @Autowired
    HistoryMapper historyMapper;
    @Override
    public List<History> getAllHistory() {
        return historyMapper.getAllHistory();
    }
}
