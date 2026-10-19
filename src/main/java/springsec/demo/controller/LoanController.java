package springsec.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("loans")
public class LoanController {

    @GetMapping("total")
    public String viewLoans(){
        return "Total loans is 100000$ ya f2eer ya 3rs";
    }
}
