package datalayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import dtos.UserDTO;
import interfaces.IUserDAO;

public class UserDAOList implements IUserDAO {

	static List<UserDTO> list = new ArrayList<UserDTO>();

	public UserDAOList() {

	}

	static {
		list.add(new UserDTO(1, "Peter", "PP", "12312323", "Kode", Arrays.asList("Hund", "Gøgler af guds nåde")));
		list.add(new UserDTO(2, "Gurli", "GG", "12312323", "Kode", Arrays.asList("Admin", "Gøgler af guds nåde")));
		list.add(new UserDTO(3, "Madsen", "MM", "12312323", "Kode",
				Arrays.asList("Admin", "Hund", "Gøgler af guds nåde")));
		list.add(new UserDTO(4, "Tobin", "TT", "12312323", "Kode", Arrays.asList("Admin")));
		list.add(new UserDTO(5, "Er", "EE", "12312323", "Kode", Arrays.asList("Bonde")));
		list.add(new UserDTO(6, "Hanne", "HH", "12312323", "Kode", Arrays.asList("Hund")));
		list.add(new UserDTO(7, "Ren", "RR", "12312323", "Kode", Arrays.asList("Admin", "Konge")));
	}

	@Override
	public List<UserDTO> GetUserList() {

		return list;

	}

	@Override
	public UserDTO GetUser(int id) {
		return GetUserList().get(--id);
	}

	@Override
	public void deleteUser(int id) {

	}

	@Override
	public void createUser() {
		list.add(new UserDTO(1000, "PUTIN", "PP", "12312323", "Kode", Arrays.asList("Hund", "Kejser")));
	}
}
