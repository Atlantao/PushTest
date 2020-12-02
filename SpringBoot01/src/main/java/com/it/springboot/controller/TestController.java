package com.it.springboot.controller;

import com.it.springboot.entity.ResponseMsg;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public ResponseMsg test(@Param("hello") String hello){
        return new ResponseMsg("请求成功，你输入的信息是："+hello,200);
    }
}
