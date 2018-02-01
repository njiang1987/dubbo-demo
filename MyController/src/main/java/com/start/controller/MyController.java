package com.start.controller;

import com.start.interfence.IMyInterfence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @Autowired
    private IMyInterfence myInterfence;
    @RequestMapping("/test.do")
    public String getTest() {
        System.out.print("11111111111");
        String str = myInterfence.helloWorld();
        System.out.print(str);
        return "welcome";
    }
}
