package com.fran.AppOneOne.Service;

import com.fran.AppOneOne.Model.Person;

import java.util.List;

public interface PersonService {


    List<Person> selectAllPerson();

    Person selectPersonById (int id);

    void insertPerson (Person nuevaPerson);

    void updatePersonById (Person updatePerson);

    void deletePersonById (int id);


}
