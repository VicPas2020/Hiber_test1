package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class DemoApplication {


	@Autowired
	private SimpleService simpleService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	}

	@Bean
	public CommandLineRunner cr(FirstRepo repo) {
		return args -> {
			for (int i = 0; i < 10; i++) {


			Machine m = new Machine(11L,"VOLGA " + i);
			repo.save(m);


			}


			//repo.delete(repo.getById(10L));
			Machine volga6 = repo.findByName("VOLGA 6");
			System.out.println(volga6);

			simpleService.method();


		};

	}




}
