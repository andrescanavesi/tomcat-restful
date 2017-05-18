package com.example.tomcat.restful;

import java.util.Date;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
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

    /**
     * PUT method for updating or creating an instance of HelloRest
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
