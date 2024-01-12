package de.lugawe.filez.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/jobs")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class JobResource {

    @Inject
    public JobResource() {}

    @GET
    @Path("/")
    public Response getJobs() {
        return Response.ok().build();
    }

    @POST
    @Path("/")
    public Response registerJob() {
        return Response.ok().build();
    }

    @GET
    @Path("/{jobId}/")
    public Response getJob(@PathParam("jobId") long jobId) {
        return Response.ok().build();
    }

    @POST
    @Path("/{jobId}/")
    public Response updateJob(@PathParam("jobId") long jobId) {
        return Response.ok().build();
    }
}
