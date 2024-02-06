package com.sandeshchapagai.demo.service;

import com.sandeshchapagai.demo.dao.PersonDao;
import com.sandeshchapagai.demo.model.Person;

public class PersonService {

    private  final  PersonDao personDao;
    public PersonService(PersonDao personDao){
        this.personDao = personDao;
    }


    public  int addPerson(Person person){
        return  PersonDao.insertPerson(person);
    }
}
