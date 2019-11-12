package by.pvt.controller;

import by.pvt.pojo.GlucosaParam;
import by.pvt.repo.GlucosaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Date;

@EnableSwagger2
@RestController
public class GlucoseController {

    @Autowired
    private GlucosaRepository glucosaRepository;

    @PostMapping(path = "/add")
    public @ResponseBody
    String addGlucosaValues(@RequestParam int glucosaValue) {
        GlucosaParam glucosaParam = new GlucosaParam();
        glucosaParam.setAnalyseTime(new Date());
        glucosaParam.setGlucosaValue(glucosaValue);
        glucosaRepository.save(glucosaParam);
        return "Saved";
    }
}

