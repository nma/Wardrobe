package io.swagger.api.factories;

import io.swagger.api.RollbackApiService;
import io.swagger.api.impl.RollbackApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-08T01:47:19.572-05:00")
public class RollbackApiServiceFactory {
    private final static RollbackApiService service = new RollbackApiServiceImpl();

    public static RollbackApiService getRollbackApi() {
        return service;
    }
}
