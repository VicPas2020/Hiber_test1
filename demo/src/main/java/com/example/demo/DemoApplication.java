package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class DemoApplication {



	@Autowired
	private CarRepo carRepo;
	@Autowired
	private EngineRepo engineRepo;



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	}

	@Bean
	public CommandLineRunner cr(   ) {
		return args -> {


			Engine engine = new Engine(1, 10, 10);
			Car car = new Car("AUDI", 40000, engine);




			engineRepo.save(engine);
			carRepo.save(car);



		};

	}




}
