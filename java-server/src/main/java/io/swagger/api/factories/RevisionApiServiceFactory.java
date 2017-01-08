package io.swagger.api.factories;

import io.swagger.api.RevisionApiService;
import io.swagger.api.impl.RevisionApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-08T01:47:19.572-05:00")
public class RevisionApiServiceFactory {
    private final static RevisionApiService service = new RevisionApiServiceImpl();

    public static RevisionApiService getRevisionApi() {
        return service;
    }
}
