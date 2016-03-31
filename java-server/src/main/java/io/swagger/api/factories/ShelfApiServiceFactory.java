package io.swagger.api.factories;

import io.swagger.api.ShelfApiService;
import io.swagger.api.impl.ShelfApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-03-31T01:56:49.084-04:00")
public class ShelfApiServiceFactory {

   private final static ShelfApiService service = new ShelfApiServiceImpl();

   public static ShelfApiService getShelfApi()
   {
      return service;
   }
}
