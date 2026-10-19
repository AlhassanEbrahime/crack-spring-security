package springsec.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("balances")
public class BalanceController {

    @GetMapping("{account-id}")
    public String viewAvailableBalance(@PathVariable("account-id") int accountId){
        return "Available balance for Account with ID: " + accountId + " is 1000$";
    }
}
