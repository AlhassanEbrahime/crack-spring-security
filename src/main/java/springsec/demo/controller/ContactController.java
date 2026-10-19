package springsec.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contact-info")
public class ContactController {

    @GetMapping("info")
    public String viewContactInfo(){
        return "contact us info";
    }
}
