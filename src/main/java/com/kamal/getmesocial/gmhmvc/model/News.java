package com.kamal.getmesocial.gmhmvc.model;

public class News {
    private int newsId;
    private String newsPicUrl;
    private String newsDesc;
    private String newsHead;

    public News() {
    }

    public News(int newsId, String newsPicUrl, String newsDesc, String newsHead) {
        this.newsId = newsId;
        this.newsPicUrl = newsPicUrl;
        this.newsDesc = newsDesc;
        this.newsHead = newsHead;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getNewsPicUrl() {
        return newsPicUrl;
    }

    public void setNewsPicUrl(String newsPicUrl) {
        this.newsPicUrl = newsPicUrl;
    }

    public String getNewsDesc() {
        return newsDesc;
    }

    public void setNewsDesc(String newsDesc) {
        this.newsDesc = newsDesc;
    }

    public String getNewsHead() {
        return newsHead;
    }

    public void setNewsHead(String newsHead) {
        this.newsHead = newsHead;
    }
}
