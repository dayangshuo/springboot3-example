package cn.dayangshuo.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DAYANG
 */
@RestController
public class TestController {

    /**
     * <a href="http://localhost:8080/hello?name=dayang">点击我</a>
     * @param name param
     * @return string
     */
    @GetMapping("/hello")
    public String hello(String name) {
        return String.join(",", "hello", name);
    }

}