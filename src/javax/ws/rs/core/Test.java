package javax.ws.rs.core;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class Test {

	
	@GET
	public String getHello()
	{
		return "Hej verden!";
	}
	
	
}
