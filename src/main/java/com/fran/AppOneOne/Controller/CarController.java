package com.fran.AppOneOne.Controller;

import com.fran.AppOneOne.Model.Car;
import com.fran.AppOneOne.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/selectallcar")
    public List<Car> selectAllCar() {
        return carService.selectAllCar();
    }
    @GetMapping("/selectallcarby/{id}")
    public Car selectAllCarById(@PathVariable int id) {
        return carService.selectAllCarById(id);
    }
    @PostMapping("/insertcar")
    public void insertCar(@RequestBody Car nuevoCar) {
        carService.insertCar(nuevoCar);
    }
    @PutMapping("/updatecar")
    public void updateCarById(@RequestBody Car updateCar) {
        carService.updateCarById(updateCar);
    }
    @DeleteMapping("/deletecarby/{id}")
    public void deleteCarById(@PathVariable int id) {
        carService.deleteCarById(id);
    }
}
