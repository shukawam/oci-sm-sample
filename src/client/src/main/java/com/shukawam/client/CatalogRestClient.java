package com.shukawam.client;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://catalog:8080")
public interface CatalogRestClient {
    @GET
    @Path("/catalog")
    List<Catalog> getAllCatalog();

    @GET
    @Path("/catalog/{id}")
    Catalog getCatalog(@PathParam("id") int id);

    @GET
    @Path("/health/ready")
    Object healthCheck();

    @GET
    @Path("/greet")
    Object greet();
}
