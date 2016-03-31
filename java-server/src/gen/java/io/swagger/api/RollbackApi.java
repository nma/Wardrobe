package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.RollbackApiService;
import io.swagger.api.factories.RollbackApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/rollback")


@io.swagger.annotations.Api(description = "the rollback API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-03-31T01:56:49.084-04:00")
public class RollbackApi  {
   private final RollbackApiService delegate = RollbackApiServiceFactory.getRollbackApi();

    @POST
    
    
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "rollback a single item", notes = "rollback one version previous", response = Void.class, tags={ "shelf" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })

    public Response rollbackShelf(@ApiParam(value = "location of shelf to rollback",required=true) @QueryParam("wardrobeUrl") String wardrobeUrl,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.rollbackShelf(wardrobeUrl,securityContext);
    }
}
