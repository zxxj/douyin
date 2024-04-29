package com.xin.controller;

import com.xin.grace.result.GraceJSONResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object hello() {
//        return "Hello Springboot";
//        return GraceJSONResult.ok("Hello Springboot");
        return GraceJSONResult.errorMsg("异常哦");
    }
}
