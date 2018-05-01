package datalayer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import dtos.UserDTO;
import interfaces.IUserDAO;

public class UserDAOList implements IUserDAO {

	static Map<Integer, UserDTO> list = new HashMap<Integer, UserDTO>();

	public UserDAOList() {}

	static {
		list.put(1, new UserDTO(getNextId(), "Peter", "PP", "12312323", "Kode", Arrays.asList("Administrator", "Operator")));
		list.put(2, new UserDTO(getNextId(), "Gurli", "GG", "12312323", "Kode", Arrays.asList("Operator")));
	}

	@Override
	public List<UserDTO> GetUserList() {
		return new ArrayList<UserDTO>(list.values());
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
	public UserDTO createUser(UserDTO user) {		
		
			user.id = getNextId();		
		
			list.put(user.id, user);
			
			return user;
	}

	private static int getNextId() {
		return list.size()+1;
	}

	@Override
	public void updateUser(UserDTO user) {

		
			/* Update user */		

			list.put(user.id, user);
	}

}
