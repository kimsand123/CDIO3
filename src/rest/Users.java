package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("users")
public class Users {

	public class Person {
		public String Name = "Kurt";
	}

	// @Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Person[] getHello() {
		return new Person[] { new Person(), new Person() };
	}
}
