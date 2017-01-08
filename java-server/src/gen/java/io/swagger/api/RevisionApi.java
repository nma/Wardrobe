package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.RevisionApiService;
import io.swagger.api.factories.RevisionApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Revision;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/revision")


@io.swagger.annotations.Api(description = "the revision API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-08T01:47:19.572-05:00")
public class RevisionApi  {
   private final RevisionApiService delegate = RevisionApiServiceFactory.getRevisionApi();

    @POST
    @Path("/")
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create revision", notes = "A version ", response = void.class, tags={ "shelf", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = void.class) })
    public Response createRevision(@ApiParam(value = "Revision object that needs to be added to a shelf" ,required=true) Revision body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createRevision(body,securityContext);
    }
    @DELETE
    @Path("/{revisionId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, tags={ "shelf", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = void.class) })
    public Response revisionRevisionIdDelete(@ApiParam(value = "ID of shelf to return",required=true) @PathParam("revisionId") Long revisionId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.revisionRevisionIdDelete(revisionId,securityContext);
    }
    @GET
    @Path("/{revisionId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Revision.class, tags={ "shelf", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Revision.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Revision.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Revision not found", response = Revision.class) })
    public Response revisionRevisionIdGet(@ApiParam(value = "ID of shelf to return",required=true) @PathParam("revisionId") Long revisionId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.revisionRevisionIdGet(revisionId,securityContext);
    }
    @PUT
    @Path("/{revisionId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, tags={ "shelf", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Shelf not found", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = void.class) })
    public Response revisionRevisionIdPut(@ApiParam(value = "ID of shelf to return",required=true) @PathParam("revisionId") Long revisionId
,@ApiParam(value = "Revision object that needs to be added to a shelf" ,required=true) Revision body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.revisionRevisionIdPut(revisionId,body,securityContext);
    }
}
