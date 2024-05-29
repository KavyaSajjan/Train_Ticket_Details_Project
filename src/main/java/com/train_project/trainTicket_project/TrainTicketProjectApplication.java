package com.train_project.trainTicket_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.train_project.trainTicket_project.Entities")
public class TrainTicketProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainTicketProjectApplication.class, args);
	}

}
