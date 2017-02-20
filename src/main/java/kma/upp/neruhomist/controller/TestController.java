package kma.upp.neruhomist.controller;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/api/helloworld")
    public ResponseEntity<String> testHelloworldApi() {
       return ResponseEntity.ok().body("Hello, world!");
    }

    @RequestMapping("/jsp/helloworld")
    public String testHelloworldJsp() {
        return "helloworld";
    }

}
