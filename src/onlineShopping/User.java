package onlineShopping;

public class User {
	private int id;
	private String username;
	private String password;
	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void userInfo() {
		System.out.println(id+" "+username+" "+password);
	}
}

