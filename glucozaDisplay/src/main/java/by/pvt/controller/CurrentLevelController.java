package by.pvt.controller;

import by.pvt.pojo.GlucosaParam;

import by.pvt.service.GlucosaParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("current")
public class CurrentLevelController {


    @Autowired
    GlucosaParamService glucosaParamService;

        @RequestMapping(method = RequestMethod.GET)
    public String showCurrentLevel(Model model){

            GlucosaParam currentParam = (GlucosaParam) glucosaParamService.getCurrentParam();
            model.addAttribute("currentParam",currentParam);
            return "current";

        }
}





























