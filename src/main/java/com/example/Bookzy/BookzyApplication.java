package com.example.Bookzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BookzyApplication {

	@RequestMapping(value = "/")
	public String index() {
		return "<h1> Welcome to Bookzy <h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(BookzyApplication.class, args);
	}

}
