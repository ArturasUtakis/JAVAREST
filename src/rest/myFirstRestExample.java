package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/myFirstRestExample")
public class myFirstRestExample {
    @GET
    @Path("/sayHi")
    public String sayHi() {
        return "Labas";
    }

    @GET
    @Path("/getStuden")
    @Produces(MediaType.APPLICATION_JSON)
    public Students getStudent() {
        Students Students = new Students(10, "Arturas", "Utakis", "utakis.arturas@gmail.com")
        return Students;
    }
}
