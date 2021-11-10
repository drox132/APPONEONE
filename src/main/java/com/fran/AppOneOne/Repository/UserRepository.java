package com.fran.AppOneOne.Repository;

import com.fran.AppOneOne.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(value = "SELECT * FROM user", nativeQuery = true)
    List<User> selectAllUser();

    @Query(value = "SELECT * FROM user", nativeQuery = true)
    User selectAllUserById(int id);

    @Query(value = "SELECT * FROM user", nativeQuery = true)
    void inserUser(String name, String password);

    @Query(value = "SELECT * FROM user", nativeQuery = true)
    void updateuser(String name, String password, int id);

    @Query(value = "SELECT * FROM user", nativeQuery = true)
    void deleteUser(int id);
}
