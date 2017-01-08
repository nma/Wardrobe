package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Promoter;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-08T01:47:19.572-05:00")
public abstract class PromoterApiService {
    public abstract Response createPromoter(Promoter body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response promoterPromoterIdDelete(Long promoterId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response promoterPromoterIdGet(Long promoterId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response promoterPromoterIdPut(Long promoterId,SecurityContext securityContext) throws NotFoundException;
}
