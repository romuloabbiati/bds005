package com.devsuperior.movieflix.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.services.UserService;

@RestController
@RequestMapping(path = "/users")
public class UserResource {

	@Autowired
	private UserService userService;
	
	@GetMapping
	private ResponseEntity<List<UserDTO>> findAll() {
		List<UserDTO> userDTO = userService.findAll();
		return ResponseEntity.ok(userDTO);
	}
	
}
