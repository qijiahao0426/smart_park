package cn.cyb.smart.controller;

import cn.cyb.smart.bean.History;
import cn.cyb.smart.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("history")
@ResponseBody
public class HistoryController {
    @Autowired
    HistoryService historyService;
    @GetMapping
    public List<History> getAllHistory() {
        return historyService.getAllHistory();
    }

}
