package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Shelf;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-08T01:47:19.572-05:00")
public abstract class ShelfApiService {
    public abstract Response addShelf(Shelf body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteShelf(Long shelfId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getShelfById(Long shelfId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response promoteDrawerId(Long shelfId,Long promoterId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response rollbackToDrawerId(Long shelfId,Long revisionId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateShelf(Long shelfId,SecurityContext securityContext) throws NotFoundException;
}
