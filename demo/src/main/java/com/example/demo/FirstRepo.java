package com.example.demo;


import org.springframework.data.jpa.repository.Query;



public interface FirstRepo extends Repo{

    @Override
    //@Query("select t from #{#entityName} t where t.name = ?1")
    Machine findByEngine(String name);





}
