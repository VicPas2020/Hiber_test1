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



//        List  resultList = em.createQuery("FROM AbstractEntity a WHERE type(a) = MachineImpl").getResultList();
//
//        for (Object o : resultList) {
//            System.out.println(o); // 6 объектов, расшифровать которые не получилось
//
//        }




                                              // ЭТО JPQL запрос!!! по имени класса
//        List  resultList = em.createQuery("FROM AbstractEntity").getResultList();
//
//        for (Object o : resultList) {
//            System.out.println(o); // 6 объектов, расшифровать которые не получилось
//
//        }

        System.out.println("----------------------------------------");
//
//        List  resultList2 = em.createQuery("FROM Machine").getResultList();
//
//        for (Object o : resultList2) {
//            System.out.println(o); // 6 объектов, расшифровать которые не получилось
//
//        }
//
//
//        System.out.println("----------------------------------------");
//
//        List  resultList3 = em.createQuery("FROM MachineImpl").getResultList();
//
//        for (Object o : resultList3) {
//            System.out.println(o); // 6 объектов, расшифровать которые не получилось
//
//        }


    }


}
