package com.example.demo;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service


public class SimpleService {



    @PersistenceContext
    private EntityManager em;

    public void method() {

//        Object aa = em.createNamedQuery("aa").getSingleResult();
//        System.out.println(aa);


        List  resultList = em.createNativeQuery("SELECT * FROM Machine").getResultList();
        System.out.println(resultList); // 6 объектов, расшифровать которые не получилось


    }


}
