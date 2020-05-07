package cn.cyb.smart.mapper;

import cn.cyb.smart.bean.History;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HistoryMapper {
    @Select("select * from history_t")
    @ResultType(History.class)
    List<History> getAllHistory();
}
