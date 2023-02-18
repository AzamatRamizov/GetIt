package HTML;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class IndexController {
    @GetMapping("/")
    public String index(){

        return "index";
    }

    @PostMapping("/register")
    public String userRegistration(){


        return "index";
    }
}
