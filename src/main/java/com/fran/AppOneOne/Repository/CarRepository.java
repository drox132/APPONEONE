package com.fran.AppOneOne.Repository;

import com.fran.AppOneOne.Model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Integer> {

    @Query(value = "SELECT * FROM car", nativeQuery = true)
    List<Car> selectAllCar();


    @Query(value = "SELECT * FROM car", nativeQuery = true)
    Car selectAllCarById(int id);


    @Query(value = "SELECT * FROM car", nativeQuery = true)
    void insertCar(String model, int price);

    @Query(value = "SELECT * FROM car", nativeQuery = true)
    void updateCarById(String model, int price, int id);

    @Query(value = "SELECT * FROM car", nativeQuery = true)
    void deleteCarById(int id);

}
