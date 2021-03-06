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
	public Response getUserWithId(@PathParam("uid") int uid) {

		UserDTO user = dao.GetUser(uid);

		// TODO: Check for null and if error return correct http error code

		return Response.ok(createUserRestDTO(user), MediaType.APPLICATION_JSON).build();
	}

	@Produces(MediaType.APPLICATION_JSON)
	@GET
	@Path("/list")
	public Response getList() {

		List<UserRestDTO> list = new ArrayList<UserRestDTO>();

		for (UserDTO user : dao.GetUserList()) {
			list.add(createUserRestDTO(user));
		}

		return Response.ok(list, MediaType.APPLICATION_JSON).build();
	}

	@Produces(MediaType.APPLICATION_JSON)
	@GET
	@Path("/listwCpr")
	public Response getListWithCpr() {

		List<UserDTO> list = new ArrayList<UserDTO>();

		for (UserDTO user : dao.GetUserList()) {
			list.add(createUserDTO(user));
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
	@Path("/update/{uid}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response updateUser(@PathParam("uid") int uid, String data) {
		
		UserDTO parsedUser = UserDTO.parseFromJSON(data);	
		
		
		parsedUser.id=uid;
		
		dao.updateUser(parsedUser);
		return Response.ok("Data:" + data, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/create")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response createUser(String data) {

		// create user kunne returnere en UIDPSSWD DTO UidPsswdDTO =
		// dao.createUser(data);
		// lav UidPsswdDTO om til et json object
		// returner det i linje 101, og skriv det ud i html/jquery.
		
		UserDTO ud = UserDTO.parseFromJSON(data);
		
		UserDTO newU = dao.createUser(ud);
		// TODO: Check for null and if error return correct http error code
		return Response.ok(newU).build();
	}

	private UserRestDTO createUserRestDTO(UserDTO user) {
		return new UserRestDTO(user.id, user.ini, user.username, user.roles);
	}

	private UserDTO createUserDTO(UserDTO user) {
		return new UserDTO(user.id, user.username, user.ini, user.cpr, user.password, user.roles);
	}

}
