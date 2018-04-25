package dtos;

import java.util.List;

// Should I use getter/setters: https://stackoverflow.com/questions/16539238/public-fields-in-a-data-transfer-object
public class UserDTO {
	public int userId;
	public String userName;
	public String ini;
	public String cpr;
	public String password;
	public List<String> roles;

	public UserDTO(int userId, String username, String ini, String cpr, String password, List<String> roles) {

		this.userId = userId;
		this.userName = username;
		this.ini = ini;
		this.cpr = cpr;
		this.password = password;
		this.roles = roles;
	}
}
