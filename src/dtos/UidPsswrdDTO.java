package dtos;

public class UidPsswrdDTO {
	
	public int userId;
	public String password;
	
	public UidPsswrdDTO(int userId, String password) {
		this.userId = userId;
		this.password = password;
		System.out.println("userId"+ userId + "  passsword "+ password);
	}
}
