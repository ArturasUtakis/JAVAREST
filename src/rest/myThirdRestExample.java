package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/myThirdRestExample")
public class myThirdRestExample {
    @GET
    @Path("userName/{username}")
    public String username(@PathParam("username")String username){
        return "Labas " + username;
    }
}
