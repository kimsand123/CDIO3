package interfaces;

import java.util.List;

import dtos.UserDTO;

public interface IUserDAO {

	List<UserDTO> GetUserList();
	UserDTO GetUser(int id);
	void deleteUser(int id);
	void createUser(String username); 
	void updateUser(String data);
}
