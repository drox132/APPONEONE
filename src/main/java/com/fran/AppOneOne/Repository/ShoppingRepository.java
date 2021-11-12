package com.fran.AppOneOne.Repository;

import com.fran.AppOneOne.Model.Shopping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShoppingRepository extends JpaRepository<Shopping,Integer> {

    @Query(value = "SELECT * FROM shopping", nativeQuery = true)
    List<Shopping> selectAllShopping();

    @Query(value = "SELECT * FROM shopping", nativeQuery = true)
    Shopping selectAllShoppingById(int id);

    @Query(value = "SELECT * FROM shopping", nativeQuery = true)
    void insertshopping(String name, String address);

    @Query(value = "SELECT * FROM shopping", nativeQuery = true)
    void updateshoppingById(int id, String name, String address);

    @Query(value = "SELECT * FROM shopping", nativeQuery = true)
    void deleteShoppingById(int id);


}
