package com.shukawam.catalog;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class CatalogService {
    private final List<Catalog> catalogList = new ArrayList<>();

    @Inject
    public CatalogService(@ConfigProperty(name = "app.imageUrl") String isImageUrl) {
        if (Boolean.parseBoolean(isImageUrl)) {
            catalogList.add(new Catalog(1, "amber", Department.Eyewear, "Elinor Glasses", 282.00, "http://lorempixel.com/640/480"));
            catalogList.add(new Catalog(2, "cyan", Department.Clothing, "Atlas Shirt", 127.00, "http://lorempixel.com/640/480"));
            catalogList.add(new Catalog(3, "teal", Department.Clothing, "Small Metal Shoes", 232.00, "http://lorempixel.com/640/480"));
            catalogList.add(new Catalog(4, "red", Department.Watches, "Red Dragon Watch", 232.00, "http://lorempixel.com/640/480"));
        } else {
            catalogList.add(new Catalog(1, "amber", Department.Eyewear, "Elinor Glasses", 282.00));
            catalogList.add(new Catalog(2, "cyan", Department.Clothing, "Atlas Shirt", 127.00));
            catalogList.add(new Catalog(3, "teal", Department.Clothing, "Small Metal Shoes", 232.00));
            catalogList.add(new Catalog(4, "red", Department.Watches, "Red Dragon Watch", 232.00));
        }
        
    }

    public List<Catalog> getCatalogList() {
        return catalogList;
    }

    public List<Catalog> getAllCatalog() {
        return getCatalogList();
    }

    public Catalog getCatalog(int id) {
        return getCatalogList().get(id - 1);
    }

}
