package com.killer.controller;

import com.killer.model.RequestObj;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;


@Controller
public class MainController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String getTest(){
        return "this is a test.";
    }

    @RequestMapping(value = "/posttest", method = RequestMethod.POST)
    @ResponseBody
    public String getPostTest(@RequestParam String UserName
            , @RequestParam int UserAge){
        String res;
        boolean isAdult = false;
        if(UserAge >= 18){
            isAdult = true;
        }
        res = "name: " + UserName + ", age: " + UserAge + ", adult: " + isAdult;
        return res;
    }

    @RequestMapping(value = "/post2/{addr}", method = RequestMethod.POST)
    @ResponseBody
    public String getPost2(@PathVariable String addr){
        return "我的地址是:" + addr;
    }

    @RequestMapping(value = "/post3/{addr}/{addr2}", method = RequestMethod.GET)
    @ResponseBody
    public String getPost2(@PathVariable String addr, @PathVariable String addr2){
        return "我的地址是 1, " + addr + ", 2:" + addr2;
    }

    @RequestMapping(value = "/obj", method = RequestMethod.POST)
    @ResponseBody
    public String getObj(RequestObj obj, HttpServletRequest request){
        String r1 = request.getMethod();
        String url = request.getRequestURI();
        String authType = request.getAuthType();
        return obj.toString() + " ... ... " + r1 + ", " + url + ", " + authType;
    }
}
