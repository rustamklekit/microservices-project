package example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigPropertiesController {

    @GetMapping("/home-two")
    public String getPropertyValue() {
        return "home-two";
    }
}
