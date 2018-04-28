package rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;

import datalayer.UserDAOList;
import dtos.UserDTO;
import interfaces.IUserDAO;
import rest.dtos.UserRestDTO;

@Path("user")
public class User {

	@Context
	Request request;
	
	
	IUserDAO dao = null;

	public User() {
		dao = new UserDAOList();
	}

	@Produces(MediaType.APPLICATION_JSON)
	@GET
	@Path("/{uid}")
	// TODO: Navn skal laves om
	public Response getHello(@PathParam("uid") int uid) {

		UserDTO user = dao.GetUser(uid);

		// TODO: Check for null and if error return correct http error code

		return Response.ok(createDTO(user), MediaType.APPLICATION_JSON).build();
	}

	@Produces(MediaType.APPLICATION_JSON)
	@GET
	@Path("/list")
	// TODO: Navn skal laves om
	public Response getHello() {

		List<UserRestDTO> list = new ArrayList<UserRestDTO>();

		for (UserDTO user : dao.GetUserList()) {
			list.add(createDTO(user));
		}

		return Response.ok(list, MediaType.APPLICATION_JSON).build();
	}

	@DELETE
	@Path("/delete/{uid}")
	public Response deleteUser(@PathParam("uid") int uid) {
		
		dao.deleteUser(uid);
		
		return Response.ok("OK", MediaType.APPLICATION_JSON).build();
	}

	// @Produces(MediaType.APPLICATION_JSON)
	@PUT
	@Path("/update")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response updateUser(String data) {
		
		
		
		
		//ObjectMapper objectMapper = new ObjectMapper();
		
		
		System.out.println(data);
		
		
		//UserDTO user = dao.updateUser(uid, data);

		// TODO: Check for null and if error return correct http error code

		return Response.ok("Data:" + data, MediaType.APPLICATION_JSON).build();
	}

	// @Produces(MediaType.APPLICATION_JSON)
	@POST
	@Path("/create")
	public Response createUser(@PathParam("username") String username) {

		// create user
		dao.createUser(username);

		// get new user for repsone

		// TODO: Check for null and if error return correct http error code
		return Response.ok("OK", MediaType.APPLICATION_JSON).build();
	}

	private UserRestDTO createDTO(UserDTO user) {
		return new UserRestDTO(user.userId, user.ini, user.userName, user.roles);
	}

}
