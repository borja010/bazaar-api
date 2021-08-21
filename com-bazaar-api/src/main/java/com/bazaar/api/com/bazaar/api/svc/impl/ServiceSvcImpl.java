/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bazaar.api.com.bazaar.api.svc.impl;

import com.bazaar.api.com.bazaar.api.dao.ServiceDao;
import com.bazaar.api.com.bazaar.api.model.Service;
import com.bazaar.api.com.bazaar.api.model.to.Response;
import com.bazaar.api.com.bazaar.api.model.to.TableResponse;
import com.bazaar.api.com.bazaar.api.svc.ServiceSvc;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Borja
 */
@RequestScoped
public class ServiceSvcImpl implements ServiceSvc {

    @Inject
    ServiceDao serviceDao;

    @Override
    public Response findAll(Integer page, Integer rows) {
        try {
            TableResponse tableResponse = new TableResponse();

            List<Service> result = serviceDao.findAll(page * rows, rows);
            tableResponse.setRows(result);

            Long total = serviceDao.findTotal();
            tableResponse.setTotal(total);

            return new Response(tableResponse, 200, "OK");
        } catch (Exception ex) {
            ex.printStackTrace();
            return new Response(null, 500, ex.toString());
        }
    }

}
