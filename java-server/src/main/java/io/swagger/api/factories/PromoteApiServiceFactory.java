package io.swagger.api.factories;

import io.swagger.api.PromoteApiService;
import io.swagger.api.impl.PromoteApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-08T01:47:19.572-05:00")
public class PromoteApiServiceFactory {
    private final static PromoteApiService service = new PromoteApiServiceImpl();

    public static PromoteApiService getPromoteApi() {
        return service;
    }
}
