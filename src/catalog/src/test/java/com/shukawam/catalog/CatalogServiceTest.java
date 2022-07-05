package com.shukawam.catalog;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;

import org.eclipse.microprofile.config.ConfigProvider;

import io.helidon.config.Config;
import io.helidon.config.ConfigSources;
import io.helidon.microprofile.tests.junit5.HelidonTest;

@HelidonTest
public class CatalogServiceTest {

    // @Test
    public void testImageUrlFalse() {
        Config.builder()
            .addSource(ConfigSources.create(Map.of("app.imageUrl", "false")))
            .build();
        var isImageUrl = ConfigProvider.getConfig().getValue("app.imageUrl", String.class);
        System.out.println((isImageUrl));
        var catalogService = new CatalogService();
        var actual = catalogService.getAllCatalog();
        var expected = createNonImageUrlCatalogList();
        for (int i = 0; i < actual.size(); i++) {
            Assertions.assertEquals(expected.get(i).id, actual.get(i).id);
            Assertions.assertEquals(expected.get(i).name, actual.get(i).name);
            Assertions.assertEquals(expected.get(i).price, actual.get(i).price);
        }
    }
 
    // @Test
    public void testImageUrlTrue() {
        Config.builder()
            .addSource(ConfigSources.create(Map.of("app.imageUrl", "true")))
            .build();
        var isImageUrl = ConfigProvider.getConfig().getValue("app.imageUrl", String.class);
        System.out.println((isImageUrl));
        var catalogService = new CatalogService();
        var actual = catalogService.getAllCatalog();
        var expected = createImageUrlCatalogList();
        for (int i = 0; i < actual.size(); i++) {
            Assertions.assertEquals(expected.get(i).id, actual.get(i).id);
            Assertions.assertEquals(expected.get(i).name, actual.get(i).name);
            Assertions.assertEquals(expected.get(i).price, actual.get(i).price);
            Assertions.assertEquals(expected.get(i).imageUrl, actual.get(i).imageUrl);
        }
    }

    private List<Catalog> createNonImageUrlCatalogList() {
        var catalogList = new ArrayList<Catalog>();
        catalogList.add(new Catalog(1, "amber", Department.Eyewear, "Elinor Glasses", 282.00));
        catalogList.add(new Catalog(2, "cyan", Department.Clothing, "Atlas Shirt", 127.00));
        catalogList.add(new Catalog(3, "teal", Department.Clothing, "Small Metal Shoes", 232.00));
        catalogList.add(new Catalog(4, "red", Department.Watches, "Red Dragon Watch", 232.00));
        return catalogList;
    }

    private List<Catalog> createImageUrlCatalogList() {
        var catalogList = new ArrayList<Catalog>();
        catalogList.add(
                new Catalog(1, "amber", Department.Eyewear, "Elinor Glasses", 282.00, "http://lorempixel.com/640/480"));
        catalogList.add(
                new Catalog(2, "cyan", Department.Clothing, "Atlas Shirt", 127.00, "http://lorempixel.com/640/480"));
        catalogList.add(new Catalog(3, "teal", Department.Clothing, "Small Metal Shoes", 232.00,
                "http://lorempixel.com/640/480"));
        catalogList.add(
                new Catalog(4, "red", Department.Watches, "Red Dragon Watch", 232.00, "http://lorempixel.com/640/480"));
        return catalogList;
    }

}
