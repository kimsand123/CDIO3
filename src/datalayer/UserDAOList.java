package datalayer;

import java.util.Arrays;
import java.util.List;
import dtos.UserDTO;
import interfaces.IUserDAO;

public class UserDAOList implements IUserDAO {

	@Override
	public List<UserDTO> GetUserList() {

		return Arrays.asList(
				new UserDTO(1, "Peter", "PP", "12312323", "Kode", Arrays.asList("Hund", "Gøgler af guds nåde")),
				new UserDTO(2, "Gurli", "GG", "12312323", "Kode", Arrays.asList("Admin", "Gøgler af guds nåde")),
				new UserDTO(3, "Madsen", "MM", "12312323", "Kode",
						Arrays.asList("Admin", "Hund", "Gøgler af guds nåde")),
				new UserDTO(4, "Tobin", "TT", "12312323", "Kode", Arrays.asList("Admin")),
				new UserDTO(5, "Er", "EE", "12312323", "Kode", Arrays.asList("Bonde")),
				new UserDTO(6, "Hanne", "HH", "12312323", "Kode", Arrays.asList("Hund")),
				new UserDTO(7, "Ren", "RR", "12312323", "Kode", Arrays.asList("Admin", "Konge")));

	}

	@Override
	public UserDTO GetUser(int id) {
		return GetUserList().get(--id);
	}
	@Override
	public void deleteUser(int id) {
		
	}
}
