package dinhluong.demo.qlnd.model;

public class User {
	String username;
	String email;
	String name;
	public User(String username, String email, String name) {
		super();
		this.username = username;
		this.email = email;
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
