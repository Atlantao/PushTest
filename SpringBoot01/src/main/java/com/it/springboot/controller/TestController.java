package com.it.springboot.controller;

import com.it.springboot.entity.ResponseMsg;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public ResponseMsg test(String hello){
        return new ResponseMsg("请求成功，你输入的信息是："+hello,200);
    }

    @RequestMapping("/query")
    public ResponseMsg query(String name){
        String result ;
        switch(name){
            case "jack":
                result = "杰克";
                break;
            case "tom":
                result = "汤姆";
                break;
            case "john":
                result = "约翰";
                break;
            case "miller":
                result = "米勒";
                break;
            case "":
                result = "世界";
                break;
            default:
                result = "系统";
                break;
        }
        return new ResponseMsg(result+"对你说HELLO！",200);
    }
}
