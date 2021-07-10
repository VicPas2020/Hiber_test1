package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@SpringBootApplication
public class DemoApplication {


	@Autowired
	PersonRepo personRepo;

	@Autowired
	PhoneRepo phoneRepo;


	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(DemoApplication.class, args);




	}

	@Bean

	public CommandLineRunner cr(   ) {
		return args -> {

			List<Phone> list = new ArrayList<>();

			Person ps = new Person("AA", "BB", list);

			Phone phone1 = new Phone(123456, ps);
			Phone phone2 = new Phone(345677, ps);
			Phone phone3 = new Phone(987654, ps);
			Phone phone4 = new Phone(510101, ps);



//			Phone phone1 = new Phone(123456);
//			Phone phone2 = new Phone(345677);
//			Phone phone3 = new Phone(987654);
//			Phone phone4 = new Phone(510101);

//			List<Phone> list = List.of(phone1, phone2, phone3);
			list.add(phone1);
			list.add(phone2);
			list.add(phone3);
			list.add(phone4);

//			for (Phone p : list) {
//				phoneRepo.save(p);
//
//			}
			ps.setPhones(list);

			// FIRST сохраняем базовую сущность One_to_Many
			personRepo.save(ps);
			// SECOND сохраняем зависимую сущность Many_to_One
			phoneRepo.saveAll(list);

		};

	}




}
