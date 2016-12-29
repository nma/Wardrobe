package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Revision;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-12-29T11:48:52.770-05:00")
public abstract class RevisionApiService {
  
      public abstract Response createRevision(Revision body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response revisionRevisionIdGet(Long revisionId,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response revisionRevisionIdPut(Long revisionId,Revision body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response revisionRevisionIdDelete(Long revisionId,SecurityContext securityContext)
      throws NotFoundException;
  
}
