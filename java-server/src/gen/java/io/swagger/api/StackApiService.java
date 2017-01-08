package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Stack;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-08T01:47:19.572-05:00")
public abstract class StackApiService {
    public abstract Response createStack(Stack body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getStacks(SecurityContext securityContext) throws NotFoundException;
    public abstract Response stackStackIdDelete(Long stackId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response stackStackIdGet(Long stackId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response stackStackIdPut(Long stackId,SecurityContext securityContext) throws NotFoundException;
}
