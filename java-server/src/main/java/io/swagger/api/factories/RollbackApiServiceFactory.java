package io.swagger.api.factories;

import io.swagger.api.RollbackApiService;
import io.swagger.api.impl.RollbackApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-03-31T01:56:49.084-04:00")
public class RollbackApiServiceFactory {

   private final static RollbackApiService service = new RollbackApiServiceImpl();

   public static RollbackApiService getRollbackApi()
   {
      return service;
   }
}
