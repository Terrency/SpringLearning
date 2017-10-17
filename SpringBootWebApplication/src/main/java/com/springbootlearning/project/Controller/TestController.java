package com.springbootlearning.project.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Junyu on 2017/10/17.
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "I am good";
    }
}
