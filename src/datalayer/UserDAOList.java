package datalayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dtos.UserDTO;
import interfaces.IUserDAO;

public class UserDAOList implements IUserDAO {

	static Map<Integer, UserDTO> list = new HashMap<Integer, UserDTO>();
	// static List<UserDTO> list = new ArrayList<UserDTO>();

	public UserDAOList() {

	}

	static {

		list.put(1, new UserDTO(1, "Peter", "PP", "12312323", "Kode", Arrays.asList("Hund", "Gøgler af guds nåde")));
		list.put(2, new UserDTO(2, "Gurli", "GG", "12312323", "Kode", Arrays.asList("Admin", "Gøgler af guds nåde")));
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
	public void createUser(String username) {

		int newId = list.size() + 1;

		list.put(newId, new UserDTO(3333, "Balder", "HH", "666", "diablo", Arrays.asList("Kejser")));
	}
	
	@Override
	public UserDTO updateUser(int id, String data) {

		//Mangler at opdatere brugerinfo
		
		return list.put(id, new UserDTO(1234, "jajaja", "jj", "123", "maestro", Arrays.asList("Administrator")));
	}
	
}
