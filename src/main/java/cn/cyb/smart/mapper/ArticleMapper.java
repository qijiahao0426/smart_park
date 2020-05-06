package cn.cyb.smart.mapper;

import cn.cyb.smart.bean.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArticleMapper {
    @Select("SELECT * \n" +
            "FROM article_t")
    @ResultType(Article.class)
    List<Article> getAllArticle();
}
