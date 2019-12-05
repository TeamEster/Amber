package com.amplexor.amber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AmberApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(AmberApplication.class, args);
		
//		User ponnda = new User("Karlo", "Pondeljak", "1", 123L, 1L);
//		User ponnda2 = new User("Karlo", "Pondeljak", "2", 123L, 2L);
//		User ponnda3 = new User("Karlo", "Pondeljak", "3", 123L, 3L);
//		User ponnda4 = new User("Karlo", "Pondeljak", "4", 123L, 1L);
//		User krisko = new User("Domagoj", "Krišković", "2", 223L, 1L);
//		
//		UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
//		
//		userRepository.save(ponnda);
//		userRepository.save(ponnda2);
//		userRepository.save(ponnda3);
//		userRepository.save(ponnda4);
//		userRepository.save(krisko);
	}

}
