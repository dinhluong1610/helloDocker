package dinhluong.demo.qlnd.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import dinhluong.demo.qlnd.model.User;

@Service
public class UserService {
	public List<User> getAllUser(){
		List<User> listUser= new ArrayList<User>();
		for(int i=0;i<10;i++) {
			User u= new User("dinhluong"+i,"dinhluong"+i+"@gmail.com","nguyendinhluong"+i );
			listUser.add(u);
		}
		return listUser;
	}
}
