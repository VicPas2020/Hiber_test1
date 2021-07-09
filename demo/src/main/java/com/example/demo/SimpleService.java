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

                                              // ЭТО JPQL запрос!!! по имени класса
        List  resultList = em.createQuery("FROM AbstractEntity").getResultList();
        System.out.println(resultList); // 6 объектов, расшифровать которые не получилось


    }


}
