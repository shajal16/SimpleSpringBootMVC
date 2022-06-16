package com.kamal.getmesocial.gmhmvc;

import com.kamal.getmesocial.gmhmvc.model.Inquiry;
import com.kamal.getmesocial.gmhmvc.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NavigationController {

    @Autowired
    private HomeService homeService;


    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("inquiry", new Inquiry());
        return "index";
    }
    @GetMapping("/index.html")
    public String home(Model model){
        model.addAttribute("inquiry", new Inquiry());
        return "index";
    }

    @GetMapping("/news.html")
    public String news(Model model){
        //homeService.getNews();
        model.addAttribute("news", homeService.getNews());
        return "news";
    }
    @PostMapping("/news.html")
    public String searchNews(Model model, @ModelAttribute Inquiry inquiry){
        //homeService.getNews();
        String heading = inquiry.getSearchString();



        model.addAttribute("news", homeService.getSearchNews(heading));
        return "news";
    }

}
