package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    private final CarServiceImpl CarService;

    public CarController(CarServiceImpl carService) {
        CarService = carService;
    }


    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {

        model.addAttribute("car", CarService.limit(count));

        return "car";
    }
}