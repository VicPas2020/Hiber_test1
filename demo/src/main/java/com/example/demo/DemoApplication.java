package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


@SpringBootApplication
public class DemoApplication {


	@Autowired
	private UniverRepo univerRepo;

	@Autowired
	private StudentRepo studentRepo;



	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(DemoApplication.class, args);




	}

	@Bean
	public CommandLineRunner cr(   ) {
		return args -> {

			University univer = new University();
			Student s1 = new Student("A1", "B1", univer);
			Student s2 = new Student("A2", "B2", univer);
			Student s3 = new Student("A3", "B3", univer);

			univer.setName("МГУ");
			univer.setAddress("Moscow");

			s1.setUniversity(univer);
			s2.setUniversity(univer);
			s3.setUniversity(univer);

			Set<Student> set = Set.of(s1,s2,s3);


			univerRepo.save(univer);

			studentRepo.saveAll(set);


		};

	}




}
