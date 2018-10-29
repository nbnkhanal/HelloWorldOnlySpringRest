package com.phonebook.app.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.phonebook.app.HelloWorld;

@Configuration
public class SampleRestConfig extends ResourceConfig{

	public SampleRestConfig(){
		register(HelloWorld.class);
	}
}
