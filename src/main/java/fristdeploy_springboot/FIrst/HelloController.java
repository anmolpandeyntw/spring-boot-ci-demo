package fristdeploy_springboot.FIrst;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello, Anmol from CI/CD pipeline!";
    }

}
