package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PromoteApiService;
import io.swagger.api.factories.PromoteApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/promote")


@io.swagger.annotations.Api(description = "the promote API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-08T01:47:19.572-05:00")
public class PromoteApi  {
   private final PromoteApiService delegate = PromoteApiServiceFactory.getPromoteApi();

    @POST
    
    
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Promote a URI to a shelf", notes = "Promotes a url to a shelf, creates a promoter if url does not exist", response = void.class, tags={ "shelf", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = void.class) })
    public Response promoteShelf(@ApiParam(value = "location of shelf to promote to",required=true) @QueryParam("wardrobeUrl") String wardrobeUrl
,@ApiParam(value = "uri to promote",required=true) @QueryParam("promoteUrl") String promoteUrl
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.promoteShelf(wardrobeUrl,promoteUrl,securityContext);
    }
}
