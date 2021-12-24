package nvc.it.test102.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontEndController {
    String viewPath = "frontend/";

    @GetMapping("/")
    public String index(){
        return viewPath+"index";
    }
    @GetMapping("/")
    public String menu(){
        return viewPath+"about";
    }
}
