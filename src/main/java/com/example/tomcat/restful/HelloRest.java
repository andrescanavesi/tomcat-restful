package com.example.tomcat.restful;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Andres Canavesi
 */
@Path("hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloRest {

    @GET
    public Response sayHello() {
        String json = "{\"hello\": \"world\"}";
        return Response.ok(json, MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Path("{echoParam}")
    public Response sayEcho(@PathParam("echoParam") String echoParam) {
        String json = "{\"echo\": \"" + echoParam + "\"}";
        return Response.ok(json, MediaType.APPLICATION_JSON).build();
    }

}
