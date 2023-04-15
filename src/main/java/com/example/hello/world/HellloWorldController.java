package com.example.hello.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
public class HellloWorldController {
    @GetMapping("/helloworld")
    public LocalDateTime helloworld(){
    LocalDateTime now = LocalDateTime.now();
        return now;
    }
}
