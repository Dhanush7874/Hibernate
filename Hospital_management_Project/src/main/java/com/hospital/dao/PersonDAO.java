package com.hospital.dao;

import java.util.List;

import com.hospital.dto.Person;

public interface PersonDAO {
public Person savePerson(int eid,Person person);
public Person getPersonId(int pid);
public boolean delethospiatlId(int pid);
public Person updatePerson(int pid,Person person);
public List<Person> getAllPerson();
public List<Person> getPersonByGender(String gender);
public List<Person> getPersonByage(int age);
public List<Person> getPersonByname(String name);


}
