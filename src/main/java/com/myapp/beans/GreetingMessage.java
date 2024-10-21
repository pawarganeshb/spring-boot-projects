package com.myapp.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("greet")
public class GreetingMessage {
	@Autowired // Field Injection
	private LocalDateTime date; // HAS - A PROPERTIES

	public String greetingMsg(String user) {
		int hr = date.getHour(); // 24hr
		if (hr < 12) {
			return "Good Morning " + user;
		} else if (hr < 16) {
			return "Good afternoon " + user;
		} else if (hr < 20) {
			return "Good Evening " + user;
		} else {
			return "Good Night " + user;
		}
	}
}
