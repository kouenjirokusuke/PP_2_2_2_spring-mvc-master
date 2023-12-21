package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", 3, 2005));
        cars.add(new Car("Mercedes", 2, 2000));
        cars.add(new Car("Renault", 5, 2009));
        cars.add(new Car("Toyota", 10, 2020));
        cars.add(new Car("Mazda", 4, 1994));
    }

    @Override
    public List<Car> getCars(int limit) {
        if (limit > this.cars.size()) {
            return this.cars;
        } else if (limit <= 0) {
            return null;
        }

        return this.cars.subList(0, limit);
    }
}
