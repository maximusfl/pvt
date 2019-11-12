package by.pvt.controller;

import by.pvt.service.GlucosaParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomePageController {


    @RequestMapping(method = RequestMethod.GET)
    public String showHomePage(){
        return "homePage";
    }
}
