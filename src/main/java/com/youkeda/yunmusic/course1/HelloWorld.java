package com.youkeda.yunmusic.course1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HelloWorld{
    @RequestMapping(value = "/")
    @ResponseBody
    public  String hello()
    {
        String  messsge="HelloWorld!";
        return  messsge;
    }
}
