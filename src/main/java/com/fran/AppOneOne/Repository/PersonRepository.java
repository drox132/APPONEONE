package com.fran.AppOneOne.Repository;

import com.fran.AppOneOne.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository <Person,Integer> {



    @Query(value= "SELECT * FROM person", nativeQuery = true)
    List<Person> selectAllPerson ();

    @Query(value = "SELECT * FROM person WHERE id= :idusuario ", nativeQuery = true)
    Person selectPersonById(@Param("idusuario") int id);


    @Query(value = "INSERT INTO  person (name, edad,sonsnumber,email) values " +
            "( :nameusuario , :ageusuario , :sonsnumberusuario, :emailusuario ) ", nativeQuery = true)
    void insertPerson(@Param("nameusuario") String name,
                      @Param("ageusuario") int age,
                      @Param("sonsnumberusuario") int sonsnumber,
                      @Param("emailusuario") String email);

    @Query(value = "UPDATE person SET name= :nameusuario , age= :ageusuario ," +
            " sonsnumber= :sonsnumberusuario , email= :emailusuario WHERE id= :idusuario ", nativeQuery = true)
    void updatePersonById(@Param("nameusuario") String name,
                          @Param("ageusuario") int age,
                          @Param("sonsnumberusuario") int sonsnumber,
                          @Param("emailusuario") String email,
                          @Param("idusuario") int id);

    @Query(value = "DELETE FROM person where id= :idusuario ", nativeQuery = true)
    void deletePersonById(@Param("idusuario") int id);




}
