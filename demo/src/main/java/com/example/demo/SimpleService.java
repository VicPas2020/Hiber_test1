package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.NamedNativeQuery;
import javax.persistence.PersistenceContext;

@Service
//@PersistenceContext()

public class SimpleService {



    @PersistenceContext
    private EntityManager em;

    public void method() {

        Object aa = em.createNamedQuery("aa").getSingleResult();
        System.out.println(aa);





    }


}
