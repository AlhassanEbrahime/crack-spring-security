package springsec.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("accounts")
public class AccountController {


    @GetMapping("{account-id}")
    public String getAccountDetails(@PathVariable("account-id") int accountId){
        return "Account details for account with ID: " + accountId;
    }
}
