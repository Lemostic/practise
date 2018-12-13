package example.controller;

import example.dao.TestDAO;
import example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class IndexController {
    @Autowired
    private TestService testService;
    @RequestMapping("/index")
    public String index(){
        testService.getUser();
        return "index";
    }

}
