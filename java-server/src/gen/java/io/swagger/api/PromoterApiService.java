package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Drawer;
import io.swagger.model.Promoter;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-09-19T22:43:03.842-04:00")
public abstract class PromoterApiService {
  
      public abstract Response createPromoter(Drawer body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response promoterPromoterIdGet(Long promoterId,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response promoterPromoterIdPut(Long promoterId,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response promoterPromoterIdDelete(Long promoterId,SecurityContext securityContext)
      throws NotFoundException;
  
}
