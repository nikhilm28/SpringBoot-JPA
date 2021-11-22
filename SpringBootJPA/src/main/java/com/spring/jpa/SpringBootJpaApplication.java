package com.spring.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.jpa.dao.UserRepository;
import com.spring.jpa.entities.User;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		
		ApplicationContext context =  SpringApplication.run(SpringBootJpaApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//		User user = new User();
//		user.setName("Nikhil");
//		user.setCity("Pune");
//		
//		User user1 = userRepository.save(user);
//		System.out.println(user1);
		
//		User user1 = new User();
//		user1.setName("Nikhil");
//		user1.setCity("Pune");
//		
//		User user2 = new User();
//		user2.setName("ABC");
//		user2.setCity("Mumbai");
//		
	//	User userSave = userRepository.save(user2);
	//	System.out.println(userSave);
		
//		List<User> users = List.of(user1,user2);
//		Iterable<User> result = userRepository.saveAll(users);
//		
//		result.forEach(user->{
//			System.out.println(user);
//
//		});
		
//		Optional<User> optional = userRepository.findById(3);
//		User user = optional.get();
//		
//		user.setName("Nikhil Madne");
//		User user2 = userRepository.save(user);
//		System.out.println(user2);
		
		userRepository.deleteById(2);
		
		Iterable<User> users = userRepository.findAll();
		users.forEach(user->System.out.println(user));
	}

}
