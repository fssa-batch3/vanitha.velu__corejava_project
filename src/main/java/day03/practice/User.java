package day03.practice;

public class User {
	
	private String name;
	private String email;
	private String pass;
	public User() {
	}
	public User(String name, String email, String pass) {
		this.name = name;
		this.email = email;
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void SetName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void SetEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void SetPass(String pass) {
		this.pass = pass;
	}
	public static void main(String[] args) {
		User one = new User();
		one.SetName("vanitha");
		one.SetEmail("vani@gmail.com");
		one.SetPass("A0315");
		System.out.println("User 1");
		System.out.println("Name = "+ one.getName());
		System.out.println("Email = "+ one.getEmail());
		System.out.println("Password = "+ one.getPass());
		System.out.println();
		User two = new User("harshi", "harshi@gmail.com", "B671111");
		System.out.println("User 2");
		System.out.println("Name = "+ two.getName());
		System.out.println("Email = "+ two.getEmail());
		System.out.println("Password = "+ two.getPass());
	}

}
