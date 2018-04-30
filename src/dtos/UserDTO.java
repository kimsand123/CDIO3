package dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

// Should I use getter/setters: https://stackoverflow.com/questions/16539238/public-fields-in-a-data-transfer-object
public class UserDTO {
	public int id;
	public String username;
	public String ini;
	public String cpr;
	public String password;
	public List<String> roles;

	public UserDTO(String username, String ini, String cpr, String password, List<String> roles) {

		this.id = -1;
		this.username = username;
		this.ini = ini;
		this.cpr = cpr;
		this.password = password;
		this.roles = roles;
	}

	public UserDTO(int userId, String username, String ini, String cpr, String password, List<String> roles) {

		this.id = userId;
		this.username = username;
		this.ini = ini;
		this.cpr = cpr;
		this.password = password; 
		this.roles = roles;
	}
}
