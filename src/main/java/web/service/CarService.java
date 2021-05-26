package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public static List<Car> carsMethod() {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("white", "GAZ", 2402));
        carsList.add(new Car("red", "VAZ", 2108));
        carsList.add(new Car("green", "ZAZ", 968));
        carsList.add(new Car("beige", "UAZ", 469));
        carsList.add(new Car("black", "ZIL", 117));
        return carsList;
    }
}
