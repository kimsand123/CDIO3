package datalayer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import dtos.UserDTO;
import interfaces.IUserDAO;

public class UserDAOList implements IUserDAO {

	static Map<Integer, UserDTO> list = new HashMap<Integer, UserDTO>();
	// static List<UserDTO> list = new ArrayList<UserDTO>();

	public UserDAOList() {

	}

	static {

		list.put(1, new UserDTO(1, "Peter", "PP", "12312323", "Kode", Arrays.asList("Administrator", "Operator")));
		list.put(2, new UserDTO(2, "Gurli", "GG", "12312323", "Kode", Arrays.asList("Operator")));
		// list.add(new UserDTO(1, "Peter", "PP", "12312323", "Kode",
		// Arrays.asList("Hund", "Gøgler af guds nåde")));
		// list.add(new UserDTO(2, "Gurli", "GG", "12312323", "Kode",
		// Arrays.asList("Admin", "Gøgler af guds nåde")));
		// list.add(new UserDTO(3, "Madsen", "MM", "12312323", "Kode",
		// Arrays.asList("Admin", "Hund", "Gøgler af guds nåde")));
		// list.add(new UserDTO(4, "Tobin", "TT", "12312323", "Kode",
		// Arrays.asList("Admin")));
		// list.add(new UserDTO(5, "Er", "EE", "12312323", "Kode",
		// Arrays.asList("Bonde")));
		// list.add(new UserDTO(6, "Hanne", "HH", "12312323", "Kode",
		// Arrays.asList("Hund")));
		// list.add(new UserDTO(7, "Ren", "RR", "12312323", "Kode",
		// Arrays.asList("Admin", "Konge")));
	}

	@Override
	public List<UserDTO> GetUserList() {

		return new ArrayList<UserDTO>(list.values());		
		//return Arrays.asList(list.values());
	}

	@Override
	public UserDTO GetUser(int id) {
		return list.get(id);
	}

	@Override
	public void deleteUser(int id) {
		list.remove(id);
	}

	@Override
	public void createUser(String data) {

		ObjectMapper objectMapper = new ObjectMapper();
		String json = data;
		JsonNode jsonNode;
		
		int newId = list.size() + 1;

		/* Generate Random passwd */

		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
		String randPwd = RandomStringUtils.random( 15, characters );
		
		try {
			jsonNode = objectMapper.readTree(json);
			int id = newId;
			String username = jsonNode.get("username").asText();
			String ini = jsonNode.get("ini").asText();
			String cpr = jsonNode.get("cpr").asText();

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

			/* Update user */

			list.put(id, new UserDTO(id, username, ini, cpr, randPwd, rolesList));

		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	@Override
	public void updateUser(String data) {

		ObjectMapper objectMapper = new ObjectMapper();
		String json = data;
		JsonNode jsonNode;

		try {

			jsonNode = objectMapper.readTree(json);
			int id = jsonNode.get("id").asInt();
			String username = jsonNode.get("username").asText();
			String ini = jsonNode.get("ini").asText();
			String cpr = jsonNode.get("cpr").asText();

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

			/* Update user */

			list.put(id, new UserDTO(id, username, ini, cpr, "passwd", rolesList));

		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
