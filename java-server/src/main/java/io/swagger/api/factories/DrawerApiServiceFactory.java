package io.swagger.api.factories;

import io.swagger.api.DrawerApiService;
import io.swagger.api.impl.DrawerApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-03-31T01:56:49.084-04:00")
public class DrawerApiServiceFactory {

   private final static DrawerApiService service = new DrawerApiServiceImpl();

   public static DrawerApiService getDrawerApi()
   {
      return service;
   }
}
