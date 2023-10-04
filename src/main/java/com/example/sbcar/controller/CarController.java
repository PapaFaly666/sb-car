/*package com.example.sbcar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sbcar.model.Car;
import com.example.sbcar.repository.CarRepository;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarRepository repository;

    @GetMapping
    public Iterable<Car> getCars() {
        return repository.findAll();
    }

    @PostMapping("/addCar") // Ajoutez cette méthode pour insérer une nouvelle voiture
    public Car addCar(@RequestBody Car car) {
        return repository.save(car);
    }
}
*/