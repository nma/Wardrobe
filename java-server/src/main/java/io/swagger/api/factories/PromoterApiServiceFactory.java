package io.swagger.api.factories;

import io.swagger.api.PromoterApiService;
import io.swagger.api.impl.PromoterApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-08T01:47:19.572-05:00")
public class PromoterApiServiceFactory {
    private final static PromoterApiService service = new PromoterApiServiceImpl();

    public static PromoterApiService getPromoterApi() {
        return service;
    }
}
