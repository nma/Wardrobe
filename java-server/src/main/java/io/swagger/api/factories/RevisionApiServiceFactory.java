package io.swagger.api.factories;

import io.swagger.api.RevisionApiService;
import io.swagger.api.impl.RevisionApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-12-29T11:48:52.770-05:00")
public class RevisionApiServiceFactory {

   private final static RevisionApiService service = new RevisionApiServiceImpl();

   public static RevisionApiService getRevisionApi()
   {
      return service;
   }
}
