package cn.cyb.smart.service.serviceimp;

import cn.cyb.smart.bean.Article;
import cn.cyb.smart.mapper.ArticleMapper;
import cn.cyb.smart.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;
    @Override
    public List<Article> getAllArticle() {
        return articleMapper.getAllArticle();
    }
}
