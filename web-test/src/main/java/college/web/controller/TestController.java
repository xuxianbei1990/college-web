package college.web.controller;

import college.web.vo.req.TestPost;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: EDY
 * Date: 2024/4/24
 * Time: 19:32
 * Version:V1.0
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Hello, Spring Boot!";
    }

    @PostMapping("/test/post")
    public String testPost(@RequestBody TestPost testPost) {
        return testPost.getName();
    }
}
