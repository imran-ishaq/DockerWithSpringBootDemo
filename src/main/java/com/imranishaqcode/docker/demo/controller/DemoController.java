package com.imranishaqcode.docker.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/demo/docker")
public class DemoController {

    @GetMapping(path = "/get")
    public String Hello(){
        return "Docker File Image Demo";
    }



    @GetMapping(path = "/getName")
    public String Hello(@RequestParam String name){
        return "Hello"+name;
    }
}
