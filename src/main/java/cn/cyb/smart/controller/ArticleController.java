package cn.cyb.smart.controller;

import cn.cyb.smart.bean.Article;
import cn.cyb.smart.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("article")
@ResponseBody
public class ArticleController {
    @Autowired
    ArticleService articleService;
    @GetMapping
    public List<Article> getAllArticle() {
        return articleService.getAllArticle();
    }
}
