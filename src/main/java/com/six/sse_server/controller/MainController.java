package com.six.sse_server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/health")
    @ResponseBody
    public String healthCheck() {
        return "ok";
    }
}