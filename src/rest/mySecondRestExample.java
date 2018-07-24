package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/mySecondRestExample")
public class mySecondRestExample {
    @GET
    @Path("/amzius")
    public Integer amzius(){
        return 25;
    }
}
