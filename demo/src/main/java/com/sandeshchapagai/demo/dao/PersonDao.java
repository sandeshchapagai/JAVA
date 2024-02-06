package com.sandeshchapagai.demo.dao;

import com.sandeshchapagai.demo.model.Person;

import java.util.UUID;

public interface PersonDao {
    static int insertPerson(Person person);
    default int addPerson(Person person){
        UUID  id = UUID.randomUUID();
        return  insertPerson(person);
    }

}
