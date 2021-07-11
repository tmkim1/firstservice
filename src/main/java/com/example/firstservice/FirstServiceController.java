package com.example.firstservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/first-service")
@Slf4j
public class FirstServiceController
{
    @GetMapping("/welcome")
    public String welcome() {
        return "Weclome to the First Service";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("first-request") String header) {
        log.info(header);
        return "Hello in First Service";
    }

    @GetMapping("/check")
    public String check() {
        return "hi there, this is a message from first Service";
    }
}
