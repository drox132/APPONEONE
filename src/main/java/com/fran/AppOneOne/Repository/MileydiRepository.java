package com.fran.AppOneOne.Repository;

import com.fran.AppOneOne.Model.Mileydi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MileydiRepository extends JpaRepository <Mileydi,Integer> {


    @Query(value = "/SELECT * FROM mileydi", nativeQuery = true)
    List<Mileydi>selctAllMileydi();

    @Query(value = "/SELECT * FROM mileydi", nativeQuery = true)
    Mileydi selectAllMileydiById(int id);

    @Query(value = "/SELECT * FROM mileydi", nativeQuery = true)
    void insertMileydi(String name, int age);

    @Query(value = "/SELECT * FROM mileydi", nativeQuery = true)
    void updateMileyById(String name, int age,int id);

    @Query(value = "/SELECT * FROM mileydi", nativeQuery = true)
    void deleteMileydiById(int id);

}
