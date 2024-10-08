package com.maheshbasapur.hello_world;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String sayHello() {
        return "hello"; // This should resolve to hello.html in the templates folder
    }
}
