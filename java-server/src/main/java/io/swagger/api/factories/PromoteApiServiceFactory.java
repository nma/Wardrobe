package io.swagger.api.factories;

import io.swagger.api.PromoteApiService;
import io.swagger.api.impl.PromoteApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-03-31T01:56:49.084-04:00")
public class PromoteApiServiceFactory {

   private final static PromoteApiService service = new PromoteApiServiceImpl();

   public static PromoteApiService getPromoteApi()
   {
      return service;
   }
}
