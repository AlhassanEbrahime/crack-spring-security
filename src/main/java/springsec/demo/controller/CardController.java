package springsec.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cards")
public class CardController {


    @GetMapping("{card-id}")
    public String viewCardInfo(@PathVariable("card-id") int cardId){
        return "Viewing card details for card with ID : " + cardId ;
    }
}
