package cn.cyb.smart.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Article {
    private int articleId;
    private String articleTitle;
    private String way;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
    private String creator;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date autoTime;

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", articleTitle='" + articleTitle + '\'' +
                ", way='" + way + '\'' +
                ", createTime=" + createTime +
                ", creator='" + creator + '\'' +
                ", autoTime=" + autoTime +
                '}';
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getAutoTime() {
        return autoTime;
    }

    public void setAutoTime(Date autoTime) {
        this.autoTime = autoTime;
    }
}
