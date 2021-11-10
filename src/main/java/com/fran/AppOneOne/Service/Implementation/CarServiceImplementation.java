package com.fran.AppOneOne.Service.Implementation;

import com.fran.AppOneOne.Model.Car;
import com.fran.AppOneOne.Repository.CarRepository;
import com.fran.AppOneOne.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImplementation implements CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarServiceImplementation(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> selectAllCar() {
        return carRepository.selectAllCar();
    }

    @Override
    public Car selectAllCarById(int id) {
        return carRepository.selectAllCarById(id);
    }

    @Override
    public void insertCar(Car nuevoCar) {
    carRepository.insertCar(nuevoCar.getModel(),nuevoCar.getPrice());
    }

    @Override
    public void updateCarById(Car updateCar) {
    carRepository.updateCarById(updateCar.getModel(),updateCar.getPrice(),updateCar.getId());
    }

    @Override
    public void deleteCarById(int id) {
    carRepository.deleteCarById(id);
    }
}
