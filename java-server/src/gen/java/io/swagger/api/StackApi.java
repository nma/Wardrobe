package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.StackApiService;
import io.swagger.api.factories.StackApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Stack;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/stack")


@io.swagger.annotations.Api(description = "the stack API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-03-31T01:56:49.084-04:00")
public class StackApi  {
   private final StackApiService delegate = StackApiServiceFactory.getStackApi();

    @GET
    @Path("/")
    
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get stacks", notes = ".", response = Stack.class, tags={ "stack",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stack.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Stack.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "stack not found", response = Stack.class) })

    public Response getStacks(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getStacks(securityContext);
    }
    @POST
    @Path("/")
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create stack", notes = ".", response = Void.class, tags={ "stack",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })

    public Response createStack(@ApiParam(value = "Stack object that needs to be added to a shelf" ,required=true) Stack body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createStack(body,securityContext);
    }
    @GET
    @Path("/{stackId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Stack.class, tags={ "stack",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stack.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Stack.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "stack not found", response = Stack.class) })

    public Response stackStackIdGet(@ApiParam(value = "ID of stack to return",required=true) @PathParam("stackId") Long stackId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.stackStackIdGet(stackId,securityContext);
    }
    @PUT
    @Path("/{stackId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "stack",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "stack not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = Void.class) })

    public Response stackStackIdPut(@ApiParam(value = "ID of shelf to update",required=true) @PathParam("stackId") Long stackId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.stackStackIdPut(stackId,securityContext);
    }
    @DELETE
    @Path("/{stackId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "stack" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })

    public Response stackStackIdDelete(@ApiParam(value = "ID of stack to delete",required=true) @PathParam("stackId") Long stackId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.stackStackIdDelete(stackId,securityContext);
    }
}
