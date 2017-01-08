package io.swagger.api.factories;

import io.swagger.api.StackApiService;
import io.swagger.api.impl.StackApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-08T01:47:19.572-05:00")
public class StackApiServiceFactory {
    private final static StackApiService service = new StackApiServiceImpl();

    public static StackApiService getStackApi() {
        return service;
    }
}
