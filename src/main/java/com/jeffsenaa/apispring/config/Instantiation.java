package com.jeffsenaa.apispring.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.jeffsenaa.apispring.domain.Post;
import com.jeffsenaa.apispring.domain.User;
import com.jeffsenaa.apispring.repository.PostRepository;
import com.jeffsenaa.apispring.repository.UserRepository;

public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;	
	
	@Autowired
	private PostRepository postRepository;	

	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		Post post1 = new Post(null, sdf.parse("23/07/2019"), "Estudando MongoDB", "Criando projeto com Spring e NoSql", bob);
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		postRepository.save(post1);
		
	}

}
