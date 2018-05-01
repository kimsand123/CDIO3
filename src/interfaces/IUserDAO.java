package interfaces;

import java.util.List;

import dtos.UidPsswrdDTO;
import dtos.UserDTO;

public interface IUserDAO {

	List<UserDTO> GetUserList();
	UserDTO GetUser(int id);
	void deleteUser(int id);
	UserDTO createUser(UserDTO ud); 
	void updateUser(String data); 
}
