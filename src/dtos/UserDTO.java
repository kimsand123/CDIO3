package dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

// Should I use getter/setters: https://stackoverflow.com/questions/16539238/public-fields-in-a-data-transfer-object
public class UserDTO {
	@JsonIgnore public int userId;
	@JsonIgnore public String userName;
	@JsonIgnore public String ini;
	@JsonIgnore public String cpr;
	@JsonIgnore public String password;
	@JsonIgnore public List<String> roles;

	public UserDTO(String username, String ini, String cpr, String password, List<String> roles) {

		this.userId = -1;
		this.userName = username;
		this.ini = ini;
		this.cpr = cpr;
		this.password = password;
		this.roles = roles;
	}

	public UserDTO(int userId, String username, String ini, String cpr, String password, List<String> roles) {

		this.userId = userId;
		this.userName = username;
		this.ini = ini;
		this.cpr = cpr;
		this.password = password; 
		this.roles = roles;
	}
}
