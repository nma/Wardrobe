package io.swagger.api.factories;

import io.swagger.api.ShelfApiService;
import io.swagger.api.impl.ShelfApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-08T01:47:19.572-05:00")
public class ShelfApiServiceFactory {
    private final static ShelfApiService service = new ShelfApiServiceImpl();

    public static ShelfApiService getShelfApi() {
        return service;
    }
}
