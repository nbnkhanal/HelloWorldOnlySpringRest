package com.phonebook.app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.phonebook.app"})
public class EntryApplication {
	public static void main(String[] args) {
		SpringApplication.run(EntryApplication.class, args);
	}

}
