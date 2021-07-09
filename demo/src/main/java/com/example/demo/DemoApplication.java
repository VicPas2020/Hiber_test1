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

	@Autowired
	private Repo_Impl repo_Impl;

	@Autowired
	private Repo_II repo_ii;



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	}

	@Bean
	public CommandLineRunner cr(FirstRepo repo) {
		return args -> {
			for (int i = 0; i < 10; i++) {


			Machine m = new Machine("VOLGA " + i);
			repo.save(m);
//			MachineImpl mi = new MachineImpl( "engine " + i, i,  "volume " + i);
//			repo.save(mi);


			}


			for (int i = 0; i < 10; i++) {
//				Machine m = new Machine("VOLGA " + i);
//				repo.save(m);
				MachineImpl mi = new MachineImpl( "engine " + i, i,  "volume " + i);
				repo_Impl.save(mi);


			}


			for (long i = 0; i < 10; i++) {
//				Machine m = new Machine("VOLGA " + i);
//				repo.save(m);
				Machine_II mII = new Machine_II(     "fire " + i);
				repo_ii.save(mII);


			}


			//repo.delete(repo.getById(10L));
//			Machine volga6 = repo.findByEngine("VOLGA 6");
//			System.out.println(volga6);

			simpleService.method();


		};

	}




}
