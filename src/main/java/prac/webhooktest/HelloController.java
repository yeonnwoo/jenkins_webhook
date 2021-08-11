package prac.webhooktest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello()
    {
        return "마지막 test";
    }

    @GetMapping("/test")
    public String test()
    {
        return "test!!";
    }
}
