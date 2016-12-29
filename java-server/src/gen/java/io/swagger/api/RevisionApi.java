package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.RevisionApiService;
import io.swagger.api.factories.RevisionApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Revision;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/revision")


@io.swagger.annotations.Api(description = "the revision API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-12-29T11:48:52.770-05:00")
public class RevisionApi  {
   private final RevisionApiService delegate = RevisionApiServiceFactory.getRevisionApi();

    @POST
    @Path("/")
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create revision", notes = "A version", response = Void.class, tags={ "shelf",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })

    public Response createRevision(@ApiParam(value = "Revision object that needs to be added to a shelf" ,required=true) Revision body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createRevision(body,securityContext);
    }
    @GET
    @Path("/{revisionId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Revision.class, tags={ "shelf",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Revision.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Revision.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Revision not found", response = Revision.class) })

    public Response revisionRevisionIdGet(@ApiParam(value = "ID of shelf to return",required=true) @PathParam("revisionId") Long revisionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.revisionRevisionIdGet(revisionId,securityContext);
    }
    @PUT
    @Path("/{revisionId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "shelf",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Shelf not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = Void.class) })

    public Response revisionRevisionIdPut(@ApiParam(value = "ID of shelf to return",required=true) @PathParam("revisionId") Long revisionId,@ApiParam(value = "Revision object that needs to be added to a shelf" ,required=true) Revision body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.revisionRevisionIdPut(revisionId,body,securityContext);
    }
    @DELETE
    @Path("/{revisionId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "shelf" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })

    public Response revisionRevisionIdDelete(@ApiParam(value = "ID of shelf to return",required=true) @PathParam("revisionId") Long revisionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.revisionRevisionIdDelete(revisionId,securityContext);
    }
}
