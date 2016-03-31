package io.swagger.api.factories;

import io.swagger.api.PromoterApiService;
import io.swagger.api.impl.PromoterApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-03-31T01:56:49.084-04:00")
public class PromoterApiServiceFactory {

   private final static PromoterApiService service = new PromoterApiServiceImpl();

   public static PromoterApiService getPromoterApi()
   {
      return service;
   }
}
