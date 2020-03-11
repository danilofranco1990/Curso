package com.projeto.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projeto.curso.entities.User;
import com.projeto.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRespository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User (null,"Denis","denis87");
		User u2 = new User (null,"Talita","talita84");
		userRespository.saveAll(Arrays.asList(u1,u2));
	}
}
