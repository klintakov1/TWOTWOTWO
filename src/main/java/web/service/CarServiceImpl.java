package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Green", 2, 280));
        cars.add(new Car("Black", 5, 300));
        cars.add(new Car("Yellow", 11, 190));
        cars.add(new Car("Blue", 8, 220));
        cars.add(new Car("White", 15, 160));
    }

    @Override
    public List<Car> limit(int a) {

        return cars.stream().limit(a).collect(Collectors.toList());
    }
}