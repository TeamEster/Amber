package com.amplexor.amber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AmberApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(AmberApplication.class, args);
		
//		Role adminRole = new Role("admin", "administator role");
//		Role userRole = new Role("user", "user role");
//		
//		Card cardPonnda = new Card("FE:78:40:5C");
//		User ponnda = new User("Karlo", "Pondeljak", "123", cardPonnda, adminRole);
//		
//		Card cardKrisko = new Card("0B:C1:EA:28");
//		User krisko = new User("Domagoj", "Krišković", "456", cardKrisko, userRole);
//		
//		UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
//		
//		userRepository.save(ponnda);
//		userRepository.save(krisko);
	}

}
