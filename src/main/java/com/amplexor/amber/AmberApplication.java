package com.amplexor.amber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.amplexor.amber.model.User;
import com.amplexor.amber.repositories.UserRepository;

@SpringBootApplication
public class AmberApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(AmberApplication.class, args);
		
		User ponnda = new User("Karlo", "Pondeljak", 123L, 1L);
		User krisko = new User("Domagoj", "Krišković", 123L, 1L);
		
		UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
		
		userRepository.save(ponnda);
		userRepository.save(krisko);
	}

}
