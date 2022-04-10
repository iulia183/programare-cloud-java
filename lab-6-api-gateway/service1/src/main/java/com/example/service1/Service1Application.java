package com.example.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@SpringBootApplication
public class Service1Application {

	public static void main(String[] args) {

		SpringApplication.run(Service1Application.class, args);
	}

	// TODO
	// 1. define a GET endpoint /api/greeting which should accept a query parameter "name"
	// 2. return should be a string returning a greeting: Hello Brasov
	// 3. print request headers
	// 4. register the service in eureka

	public class Greeting {

		private final long id;
		private final String content;

		public Greeting(long id, String content) {
			this.id = id;
			this.content = content;
		}

		public long getId() {
			return id;
		}

		public String getContent() {
			return content;
		}
	}

	@RestController
	public class GreetingController {

		private static final String template = "Hello, %s!";
		private final AtomicLong counter = new AtomicLong();

		@GetMapping("/greeting")
		public Greeting greeting(@RequestParam(value = "name", defaultValue = "Brasov") String name) {
			return new Greeting(counter.incrementAndGet(), String.format(template, name));
		}
	}

}
