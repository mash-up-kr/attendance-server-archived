package kr.mashup.attendance.ui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sample() {
        return "Hello mashup-api";
    }
}
