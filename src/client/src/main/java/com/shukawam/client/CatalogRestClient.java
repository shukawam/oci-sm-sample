package com.shukawam.client;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "https://catalog:8080/catalog")
public interface CatalogRestClient {
    @GET
    List<Catalog> getAllCatalog();

    @GET
    @Path("{id}")
    Catalog getCatalog(@PathParam("id") int id);
}
