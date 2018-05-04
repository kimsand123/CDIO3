package rest.dtos;

import java.util.List;

public class UserRestDTO {

	public int id;
	public String ini;
	public String username;
	public List<String> roles;

	public UserRestDTO(int id, String ini, String username, List<String> roles) {
		this.id = id;
		this.ini = ini;
		this.username = username;
		this.roles = roles;
	}
}
