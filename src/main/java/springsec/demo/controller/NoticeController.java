package springsec.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notices")
public class NoticeController {


    @GetMapping("data")
    public String getNotices(){
        return "Notices data";
    }
}
