package com.example.demo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class DemoApplication {


	private final WifeRepo wifeRepo;
	private final HusbandRepo husbandRepo;

	public DemoApplication(WifeRepo wifeRepo, HusbandRepo husbandRepo) {
		this.wifeRepo = wifeRepo;
		this.husbandRepo = husbandRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	}

	@Bean
	public CommandLineRunner cr(   ) {
		return args -> {


			Man hs = new Man();
			Woman wf = new Woman();


			hs.setFirstName("H1");
			hs.setLastName("H2");
			hs.setWife(wf);

			wf.setFirstName("W1");
			wf.setLastName("W2");
			wf.setHusband(hs);


			husbandRepo.save(hs);
			wifeRepo.save(wf);



			// после развода
			hs.setWife(null);
			husbandRepo.saveAndFlush(hs);



		};

	}




}
