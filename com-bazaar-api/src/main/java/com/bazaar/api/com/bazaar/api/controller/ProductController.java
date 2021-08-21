/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bazaar.api.com.bazaar.api.controller;

import com.bazaar.api.com.bazaar.api.model.to.Response;
import com.bazaar.api.com.bazaar.api.svc.ProductSvc;
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
 * @author Borja
 */
@Singleton
@Path("/product")
public class ProductController {

    @Inject
    ProductSvc productService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    public Response findAll(@DefaultValue("0") @QueryParam("page") Integer page, @DefaultValue("5") @QueryParam("rows") Integer rows) {
        return productService.findAll(page, rows);
    }

}
