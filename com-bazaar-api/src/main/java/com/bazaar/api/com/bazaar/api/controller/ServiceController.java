package com.bazaar.api.com.bazaar.api.controller;

import com.bazaar.api.com.bazaar.api.model.to.Response;
import com.bazaar.api.com.bazaar.api.svc.ServiceSvc;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 */
@Singleton
@Path("/service")
public class ServiceController {

    @Inject
    ServiceSvc serviceSvc;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    public Response findAll(@DefaultValue("0") @QueryParam("page") Integer page, @DefaultValue("5") @QueryParam("rows") Integer rows) {
        return serviceSvc.findAll(page, rows);
    }

}
