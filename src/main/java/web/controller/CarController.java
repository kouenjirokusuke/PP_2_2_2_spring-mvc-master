package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

import java.util.Optional;

@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarServiceImp carService;

    @GetMapping
    public String getCars(@RequestParam Optional<Integer> count, ModelMap model) {
        model.addAttribute("cars", carService.getCars(count.orElse(Integer.MAX_VALUE)));
        return "cars";
    }
}
