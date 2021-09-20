package dinhluong.demo.qlnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dinhluong.demo.qlnd.model.User;
import dinhluong.demo.qlnd.services.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("user")
	public ResponseEntity<?> getAllUser() {
		List<User> listUser= userService.getAllUser();
		return new ResponseEntity<>(listUser, HttpStatus.OK);
	}
}
