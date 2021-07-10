package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class DemoApplication {



	@Autowired

	private HusbandRepo husbandRepo;

	@Autowired
	private WifeRepo wifeRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	}

	@Bean
	public CommandLineRunner cr(   ) {
		return args -> {

		Husband hs = new Husband();
		Wife wf = new Wife();


		hs.setFirstName("H1");
		hs.setLastName("H2");
		hs.setWife(wf);

		wf.setFirstName("W1");
		wf.setLastName("W2");
		wf.setHusband(hs);


		wifeRepo.save(wf);
		husbandRepo.save(hs);





		};

	}




}
