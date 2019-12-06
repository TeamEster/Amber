package com.amplexor.amber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AmberApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(AmberApplication.class, args);
//		
//		Role adminRole = new Role("admin", "administator role");
//		Role userRole = new Role("user", "user role");
//		
//		Card cardPonnda = new Card("FE:78:40:5C");
//		Card cardKrisko = new Card("0B:C1:EA:28");
//		Card cardRobi = new Card("XX:78:40:5C"); //not correct
//		Card cardEster = new Card("AB:C7:E8:28");
//		Card cardAnja = new Card("EB:09:EE:B6");
//		Card cardFran = new Card("FE:78:40:XX"); //not correct
//		
//		User ponnda = new User("Karlo", "Pondeljak", "123", cardPonnda, adminRole);
//		User krisko = new User("Domagoj", "Krišković", "456", cardKrisko, userRole);
//		User robi = new User("Robert", "Batusic", "129999", cardRobi, adminRole);
//		User ester = new User("Ester", "Prednivoj", "12324563", cardEster, userRole);
//		User anja = new User("Anja", "Pletkapa", "154654623", cardAnja, adminRole);
//		User franjo = new User("Fran", "Nikić", "126756883", cardFran, userRole);
//		
//		List<User> users = new ArrayList<>();
//		users.add(ponnda);
//		users.add(krisko);
//		users.add(robi);
//		users.add(ester);
//		users.add(anja);
//		users.add(franjo);
//		
//		UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
//		userRepository.saveAll(users);
	}

}
