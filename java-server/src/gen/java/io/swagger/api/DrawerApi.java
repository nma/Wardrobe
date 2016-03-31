package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DrawerApiService;
import io.swagger.api.factories.DrawerApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Drawer;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/drawer")


@io.swagger.annotations.Api(description = "the drawer API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-03-31T01:56:49.084-04:00")
public class DrawerApi  {
   private final DrawerApiService delegate = DrawerApiServiceFactory.getDrawerApi();

    @POST
    @Path("/")
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create drawer", notes = ".", response = Void.class, tags={ "shelf",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })

    public Response createDrawer(@ApiParam(value = "Drawer object that needs to be added to a shelf" ,required=true) Drawer body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createDrawer(body,securityContext);
    }
    @GET
    @Path("/{drawerId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Drawer.class, tags={ "shelf",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Drawer.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Drawer.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Drawer not found", response = Drawer.class) })

    public Response drawerDrawerIdGet(@ApiParam(value = "ID of shelf to return",required=true) @PathParam("drawerId") Long drawerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.drawerDrawerIdGet(drawerId,securityContext);
    }
    @PUT
    @Path("/{drawerId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "shelf",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Shelf not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = Void.class) })

    public Response drawerDrawerIdPut(@ApiParam(value = "ID of shelf to return",required=true) @PathParam("drawerId") Long drawerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.drawerDrawerIdPut(drawerId,securityContext);
    }
    @DELETE
    @Path("/{drawerId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "shelf" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })

    public Response drawerDrawerIdDelete(@ApiParam(value = "ID of shelf to return",required=true) @PathParam("drawerId") Long drawerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.drawerDrawerIdDelete(drawerId,securityContext);
    }
}
