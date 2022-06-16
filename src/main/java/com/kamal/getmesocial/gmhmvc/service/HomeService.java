package com.kamal.getmesocial.gmhmvc.service;

import com.kamal.getmesocial.gmhmvc.model.News;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {
    public List<News> getNews(){

        List<News> news = new ArrayList<>();

        News news1 = new News(1, "https://pbs.twimg.com/profile_images/722495756351840256/oDrAgBzX_400x400.jpg", "AAAA VEEERRRRYYY LONGGGG DESC...", "Global News");

        News news2 = new News(1, "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ea/BBC_World_News_2022_%28Boxed%29.svg/1200px-BBC_World_News_2022_%28Boxed%29.svg.png", "AAAA VEEERRRRYYY LONGGGG DESC...", "BBC WORLD");

        news.add(news1);
        news.add(news2);

        return news;


    }
    public List<News> getSearchNews(String heading){

        List<News> news = new ArrayList<>();

        News news1 = new News(1, "https://pbs.twimg.com/profile_images/722495756351840256/oDrAgBzX_400x400.jpg", "AAAA VEEERRRRYYY LONGGGG DESC...", heading);


        news.add(news1);

        return news;


    }
}
