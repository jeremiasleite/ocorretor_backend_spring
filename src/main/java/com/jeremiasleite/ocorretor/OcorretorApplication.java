package com.jeremiasleite.ocorretor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.jeremiasleite.ocorretor.resources","com.jeremiasleite.ocorretor.services"})
public class OcorretorApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcorretorApplication.class, args);
	}

}
