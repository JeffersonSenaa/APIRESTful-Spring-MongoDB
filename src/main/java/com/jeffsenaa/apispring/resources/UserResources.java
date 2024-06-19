package com.jeffsenaa.apispring.resources;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jeffsenaa.apispring.domain.User;

@RestController
@RequestMapping(value="/uses")
public class UserResources {

	@RequestMapping(method = RequestMethod.GET)
	public List<User> findAll(){
		throw new UnsupportedOperationException("Ainda não implementado");
		//TODO:implementar
	}
}
