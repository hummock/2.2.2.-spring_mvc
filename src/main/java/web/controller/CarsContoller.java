package web.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

public class CarsContoller {

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, Model model) {
        List<Car> tempCars = new ArrayList<>();

        if (count == 0 || count > 5) {
            count = 5;
        }

        for (int i = 0; i < count; i++) {
            tempCars.add(CarService.carsMethod().get(i));
        }

        model.addAttribute("result", tempCars);
        return "cars";

    }
}
