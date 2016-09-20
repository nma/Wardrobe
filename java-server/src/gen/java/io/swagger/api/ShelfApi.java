package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ShelfApiService;
import io.swagger.api.factories.ShelfApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Shelf;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/shelf")


@io.swagger.annotations.Api(description = "the shelf API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-09-19T22:43:03.842-04:00")
public class ShelfApi  {
   private final ShelfApiService delegate = ShelfApiServiceFactory.getShelfApi();

    @POST
    
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "shelf",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })

    public Response addShelf(@ApiParam(value = "Shelf object that needs to be added to the wardrobe" ,required=true) Shelf body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addShelf(body,securityContext);
    }
    @GET
    @Path("/{shelfId}")
    
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find shelf by ID", notes = "Returns a single shelf", response = Shelf.class, tags={ "shelf",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shelf.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Shelf.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Shelf not found", response = Shelf.class) })

    public Response getShelfById(@ApiParam(value = "ID of shelf to return",required=true) @PathParam("shelfId") Long shelfId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getShelfById(shelfId,securityContext);
    }
    @PUT
    @Path("/{shelfId}")
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update an existing shelf", notes = "", response = Void.class, tags={ "shelf",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Shelf not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = Void.class) })

    public Response updateShelf(@ApiParam(value = "ID of shelf to return",required=true) @PathParam("shelfId") Long shelfId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateShelf(shelfId,securityContext);
    }
    @DELETE
    @Path("/{shelfId}")
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update an existing shelf", notes = "", response = Void.class, tags={ "shelf",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })

    public Response deleteShelf(@ApiParam(value = "ID of shelf to return",required=true) @PathParam("shelfId") Long shelfId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteShelf(shelfId,securityContext);
    }
    @GET
    @Path("/{shelfId}/promote/{promoterId}")
    
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find shelf by ID", notes = "Returns a single shelf", response = Void.class, tags={ "shelf",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class) })

    public Response promoteDrawerId(@ApiParam(value = "ID of shelf to promote",required=true) @PathParam("shelfId") Long shelfId,@ApiParam(value = "ID of promoter to promote from",required=true) @PathParam("promoterId") Long promoterId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.promoteDrawerId(shelfId,promoterId,securityContext);
    }
    @GET
    @Path("/{shelfId}/rollback/{drawerId}")
    
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find shelf by ID", notes = "Returns a single shelf", response = Void.class, tags={ "shelf" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class) })

    public Response rollbackToDrawerId(@ApiParam(value = "ID of shelf to rollback",required=true) @PathParam("shelfId") Long shelfId,@ApiParam(value = "ID of drawer to rollback to",required=true) @PathParam("drawerId") Long drawerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.rollbackToDrawerId(shelfId,drawerId,securityContext);
    }
}
