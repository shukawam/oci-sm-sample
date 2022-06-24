package com.shukawam.client;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api")
public class ClientResource {
    @Inject
    @RestClient
    private CatalogRestClient catalogRestClient;

    @GET
    @Path("/catalog")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Catalog> getAllCatalog() {
        return catalogRestClient.getAllCatalog();
    }
    
    @GET
    @Path("/catalog/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Catalog getCatalog(@PathParam("id") int id) {
        return catalogRestClient.getCatalog(id);
    }

}
