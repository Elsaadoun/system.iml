package com.yourcompany.pollingsystem;

import com.yourcompany.pollingsystem.model.Poll;
import com.yourcompany.pollingsystem.service.PollService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class PollingSystemApplication {

	public static void main(String[] args) {
		// Launching the Spring Boot application
		ApplicationContext context = SpringApplication.run(PollingSystemApplication.class, args);

		// Retrieving the PollService bean from the application context
		PollService pollService = context.getBean(PollService.class);

		// Creating the first poll
		Poll poll1 = new Poll();
		poll1.setQuestion("Among the following, what do you prefer doing the most?");
		poll1.setOptions(Arrays.asList("Watching TV", "Playing on the computer", "Hanging out with friends", "Traveling the world"));
		pollService.createPoll(poll1); // Ensure this method exists in PollService

		// Creating the second poll
		Poll poll2 = new Poll();
		poll2.setQuestion("What is your favorite place to travel?");
		poll2.setOptions(Arrays.asList("USA", "France", "South America", "Thailand"));
		pollService.createPoll(poll2); // Similarly for this line
	}
}

