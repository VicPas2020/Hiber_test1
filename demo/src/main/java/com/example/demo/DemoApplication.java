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


//	@Autowired
//
//
//	@Autowired



	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(DemoApplication.class, args);




	}

	@Bean

	public CommandLineRunner cr(   ) {
		return args -> {


		};

	}




}
