package rest;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("roles")
public class Roles {

	@Produces(MediaType.APPLICATION_JSON)
	@GET
	//TODO: Admin, Pharmacist, Produktionsleder, Laborant
	public Response getRoleList() {
		return Response.ok(Arrays.asList("Admin", "Operatør", "Afvejer"), MediaType.APPLICATION_JSON).build();
	}
}
