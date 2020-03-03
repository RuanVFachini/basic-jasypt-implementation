package br.com.hemar.encryptproperties.controller;

import br.com.hemar.encryptproperties.model.Car;
import br.com.hemar.encryptproperties.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarRepository carRepository;

    @GetMapping("/all")
    public List<Car> getAll() {
        carRepository.save(new Car(1L,"Camaro","chevrolet"));
        carRepository.save(new Car(2L,"Brasilia","WolksVagem"));
        return carRepository.findAll();
    }
}
