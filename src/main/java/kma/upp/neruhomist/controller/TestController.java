package kma.upp.neruhomist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/api/helloworld")
    public ResponseEntity<String> testHelloworldApi() {
       return ResponseEntity.ok().body("Hello, world!");
    }

    @RequestMapping("/jsp/helloworld")
    public String testHelloworldJsp() {
        return "helloworld";
    }

    @RequestMapping("/db")
    public ResponseEntity<String> testDb() {
        String result = jdbcTemplate.queryForObject("select 'OK'", String.class);
        return result == null ? ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("DB test request failed") : ResponseEntity.ok(result);
    }

}
