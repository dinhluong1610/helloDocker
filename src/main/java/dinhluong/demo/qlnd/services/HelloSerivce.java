package dinhluong.demo.qlnd.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSerivce {
	@GetMapping("hello")
	public String Hello() {
		return "Hello";
	}
}