package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Set;


@SpringBootApplication
public class DemoApplication {


	@Autowired
	private ShopRepo shopRepo;

	@Autowired
	private CustomerRepo customerRepo;


	public static void main(String[] args)  {
		SpringApplication.run(DemoApplication.class, args);


	}

	@Bean
	public CommandLineRunner cr(   ) {
		return args -> {

			Shop shop1 = new Shop();
			Shop shop2 = new Shop();
			Shop shop3 = new Shop();


			Customer customer1 = new Customer();
			Customer customer2 = new Customer();
			Customer customer3 = new Customer();



			shop1.setBrand("Mall_1");
			shop1.setAddress("Moscow");
			shop1.setStudents(Set.of(customer1));

			shop2.setBrand("Mall_2");
			shop2.setAddress("Perm");
			shop2.setStudents(Set.of(customer2, customer3));

			shop3.setBrand("Mall_3");
			shop3.setAddress("Vladivostok");
			shop3.setStudents(Set.of(customer3, customer1, customer2));

			customer1.setFirstName("A1");
			customer1.setLastName("B1");
			customer1.setShop(Set.of(shop1));

			customer2.setFirstName("A2");
			customer2.setLastName("B2");
			customer2.setShop(Set.of(shop1, shop2));

			customer3.setFirstName("A3");
			customer3.setLastName("B3");
			customer3.setShop(Set.of(shop1, shop2, shop3));



			shopRepo.saveAll(Set.of(shop1, shop2, shop3));
			customerRepo.saveAll(Set.of(customer3, customer1, customer2));








//
//			// FIRST сохраняем базовую сущность One_to_Many
//			shopRepoRepo.save(shop);
//			// SECOND сохраняем associated сущность Many_to_One
//			customerRepo.saveAll(set);


		};

	}




}
