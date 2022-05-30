package com.ruanko.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    private String defaultPage(){
        return "user/login";
    }
    @RequestMapping("/index")
    private String index(){
        return "index";
    }
}
