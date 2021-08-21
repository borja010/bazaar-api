/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bazaar.api.com.bazaar.api.svc;

import com.bazaar.api.com.bazaar.api.model.to.Response;

/**
 *
 * @author Borja
 */
public interface ServiceSvc {
    
    public Response findAll(Integer page, Integer rows);
    
}
