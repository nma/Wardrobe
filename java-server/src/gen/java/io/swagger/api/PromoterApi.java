package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PromoterApiService;
import io.swagger.api.factories.PromoterApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Drawer;
import io.swagger.model.Promoter;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/promoter")


@io.swagger.annotations.Api(description = "the promoter API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-03-31T01:56:49.084-04:00")
public class PromoterApi  {
   private final PromoterApiService delegate = PromoterApiServiceFactory.getPromoterApi();

    @POST
    
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create drawer", notes = ".", response = Void.class, tags={ "shelf",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })

    public Response createPromoter(@ApiParam(value = "Drawer object that needs to be added to a shelf" ,required=true) Drawer body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createPromoter(body,securityContext);
    }
    @GET
    @Path("/{promoterId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Promoter.class, tags={ "shelf",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Promoter.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Promoter.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "promoter not found", response = Promoter.class) })

    public Response promoterPromoterIdGet(@ApiParam(value = "ID of promoter to return",required=true) @PathParam("promoterId") Long promoterId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.promoterPromoterIdGet(promoterId,securityContext);
    }
    @PUT
    @Path("/{promoterId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "shelf",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "promoter not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = Void.class) })

    public Response promoterPromoterIdPut(@ApiParam(value = "ID of promoter to update",required=true) @PathParam("promoterId") Long promoterId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.promoterPromoterIdPut(promoterId,securityContext);
    }
    @DELETE
    @Path("/{promoterId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "shelf" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })

    public Response promoterPromoterIdDelete(@ApiParam(value = "ID of promoter to delete",required=true) @PathParam("promoterId") Long promoterId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.promoterPromoterIdDelete(promoterId,securityContext);
    }
}
