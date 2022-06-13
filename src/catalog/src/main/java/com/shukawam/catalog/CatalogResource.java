/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.shukawam.catalog;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author shukawam
 */
@Path("catalog")
public class CatalogResource {
    private final CatalogService catalogService;

    @Inject
    public CatalogResource(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Catalog> getAllCatalog() {
        return catalogService.getAllCatalog();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Catalog getCatalog(@PathParam("id") int id) {
        return catalogService.getCatalog(id);
    }
}
