package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("home")
    public String home(){
        return "index.jsp";
    }

    //please add tomcat jasper from maven repo
    //for dependencies tomcat jasper please look project > external libraries > tomcat core 9.0.41
    //https://mvnrepository.com/artifact/org.apache.tomcat/tomcat-jasper/9.0.41

    @RequestMapping("home2")
    public String home2(){
        return "index";
    }
}
