package dtos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import tools.PassGen;

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

	public static UserDTO parseFromJSON(String data) {

		ObjectMapper objectMapper = new ObjectMapper();
		String json = data;
		JsonNode jsonNode;		

		try {
			jsonNode = objectMapper.readTree(json);

			// int id = newId;
			String username = jsonNode.get("username").asText();
			String ini = jsonNode.get("ini").asText();
			String cpr = jsonNode.get("cpr").asText();
			String pass = PassGen.createPassword(15);

			List<String> rolesList = new ArrayList<>();

			/* Check for roles */
			if (jsonNode.has("admintick")) {

				rolesList.add("Administrator");

			}
			if (jsonNode.has("foremantick")) {

				rolesList.add("Foreman");

			}
			if (jsonNode.has("operatortick")) {

				rolesList.add("Operator");

			}
			if (jsonNode.has("pharmatick")) {

				rolesList.add("Pharmacist");

			}

			return new UserDTO(username, ini, cpr, pass, rolesList);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
