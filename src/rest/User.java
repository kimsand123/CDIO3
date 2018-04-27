package rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import datalayer.UserDAOList;
import dtos.UserDTO;
import interfaces.IUserDAO;
import rest.dtos.UserRestDTO;

@Path("user")
public class User {

	IUserDAO dao = null;

	public User() {
		dao = new UserDAOList();
	}

	
	
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	@Path("/{uid}")
	public Response getHello(@PathParam("uid") int uid) {

		UserDTO user = dao.GetUser(uid);

		// TODO: Check for null and if error return correct http error code

		return Response.ok(createDTO(user), MediaType.APPLICATION_JSON).build();
	}

	@Produces(MediaType.APPLICATION_JSON)
	@GET	
	@Path("/list")
	public Response getHello() {

		List<UserRestDTO> list = new ArrayList<UserRestDTO>();

		for (UserDTO user : dao.GetUserList()) {
			list.add(createDTO(user));
		}

		return Response.ok(list, MediaType.APPLICATION_JSON).build();
	}
	
	
	
	
	@DELETE
	@Path("/delete/{uid}")
	public ResponseBuilder deleteUser(@PathParam("uid") int uid)
	{
		
		return Response.ok();
		
	}
	
	//@Produces(MediaType.APPLICATION_JSON)
	@PUT
	@Path("/update/{uid}")
	public Response updateUser(@PathParam("uid") int uid) {

		UserDTO user = dao.GetUser(uid);

		// TODO: Check for null and if error return correct http error code

		return Response.ok(createDTO(user), MediaType.APPLICATION_JSON).build();
	}
	

	private UserRestDTO createDTO(UserDTO user) {
		return new UserRestDTO(user.userId, user.ini, user.userName, user.roles);
	}
	
}
