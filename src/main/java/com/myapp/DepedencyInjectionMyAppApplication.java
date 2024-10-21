package com.myapp;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.myapp.beans.GreetingMessage;

@SpringBootApplication
public class DepedencyInjectionMyAppApplication {
	@Bean("message")
	LocalDateTime getGreetingMessage() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DepedencyInjectionMyAppApplication.class, args);
		System.out.println("Get Class Name:: " + context.getClass());
		GreetingMessage message = context.getBean("greet", GreetingMessage.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of user: ");
		String name = sc.nextLine();

		System.out.println(message.greetingMsg(name));
		sc.close();
	}

}
