package com.fran.AppOneOne.Service;

import com.fran.AppOneOne.Model.Car;

import java.util.List;

public interface CarService {

    List<Car> selectAllCar();
    Car selectAllCarById(int id);
    void insertCar(Car nuevoCar);
    void updateCarById(Car updateCar);
    void deleteCarById(int id);

}
