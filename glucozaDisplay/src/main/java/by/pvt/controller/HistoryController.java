package by.pvt.controller;

import by.pvt.pojo.GlucosaParam;
import by.pvt.service.GlucosaParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("history")
public class HistoryController {

    @Autowired
    GlucosaParamService glucosaParamService;

    @RequestMapping(method = RequestMethod.GET)
    public String ShowHistory(Model model){
        List<GlucosaParam> glucosaParams = glucosaParamService.getHistory();
        model.addAttribute("glucosaParams", glucosaParams);
        return "history";

    }


}
