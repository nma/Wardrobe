package io.swagger.api.factories;

import io.swagger.api.StackApiService;
import io.swagger.api.impl.StackApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-03-31T01:56:49.084-04:00")
public class StackApiServiceFactory {

   private final static StackApiService service = new StackApiServiceImpl();

   public static StackApiService getStackApi()
   {
      return service;
   }
}
