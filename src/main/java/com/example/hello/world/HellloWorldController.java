package com.example.hello.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellloWorldController {
    @GetMapping("/helloworld")
    public String helloworld(){
        return "helloworld";
    }
}
