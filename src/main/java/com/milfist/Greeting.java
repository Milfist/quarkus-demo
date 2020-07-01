package com.milfist;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v1")
public class Greeting {

  @GET
  @Path("/hello/{name}")
  @Produces(MediaType.TEXT_PLAIN)
  public String greeting(@PathParam String name) {
    return "hello " + name;
  }
}
