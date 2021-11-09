package com.fran.AppOneOne.Service.Implementation;

import com.fran.AppOneOne.Model.Person;
import com.fran.AppOneOne.Repository.PersonRepository;
import com.fran.AppOneOne.Service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImplementation implements PersonService {

    Logger logger= LoggerFactory.getLogger(PersonServiceImplementation.class);

    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImplementation(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> selectAllPerson() {
            logger.info("Iniciando el metodo selectallperson");
        List<Person> personList= personRepository.selectAllPerson();

        try{
        if (personList==null) {
           throw new IllegalArgumentException("El resultado de la lista selectallperson es null");
        }
        return personList;
        } catch (Exception error) {
            logger.error("Ha ocurrido un error en el metodo selectallperson");
            return null;
        }
    }

    @Override
    public Person selectPersonById(int id) {
        logger.info("iniciando el metodo selectpersonbyid");
        try{
        if (id==0){
            throw new IllegalArgumentException("El dato del id es incorrecto o null");
        }
        return personRepository.selectPersonById(id);
        }catch (Exception error){
            logger.error("Ha ocurrido un error en el metodo");
            return null;
        }
    }

    @Override
    public void insertPerson(Person nuevaPerson) {
        logger.info("iniciando el metodo insertperson");
        try{
            if (nuevaPerson==null){
            throw new IllegalArgumentException("El dato ingresado en nuevaperson es incorrecto");
            }
        personRepository.insertPerson(
                nuevaPerson.getName(),
                nuevaPerson.getAge(),
                nuevaPerson.getSonsnumber(),
                nuevaPerson.getEmail());
        }catch (Exception error){
            logger.error("Ha ocurrido un error en el metodo insertperson");

        }
    }

    @Override
    public void updatePersonById(Person updatePerson) {
    logger.info("iniciando el metodo update person");
        try {
            if (updatePerson == null) {
                throw new IllegalArgumentException("el dato updateperson es incorrecto");
            }
            personRepository.updatePersonById(
                    updatePerson.getName(),
                    updatePerson.getAge(),
                    updatePerson.getSonsnumber(),
                    updatePerson.getEmail(),
                    updatePerson.getId());
        }catch (Exception error){
            logger.error("<<ha ocuurido un error en la implementacion del metodo updatepersonbyid");
        }
    }

    @Override
    public void deletePersonById(int id) {
        logger.info("iniciando la implementacion del metodo deletperson");
        try {
            if (id == 0) {
                throw new IllegalArgumentException("el dato ingresado en el id de deletepersonbyid es incorrecto");
            }
            personRepository.deletePersonById(id);
        }catch (Exception error){
            logger.error("Ha ocurrido un error en el metodo deletepersonbyid");
        }
    }
}
