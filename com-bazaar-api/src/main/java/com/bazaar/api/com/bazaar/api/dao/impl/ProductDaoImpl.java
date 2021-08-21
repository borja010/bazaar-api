/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bazaar.api.com.bazaar.api.dao.impl;

import com.bazaar.api.com.bazaar.api.dao.ProductDao;
import com.bazaar.api.com.bazaar.api.model.Product;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Borja
 */
@RequestScoped
public class ProductDaoImpl implements ProductDao {

    @PersistenceContext(unitName = "bazaarPu")
    private EntityManager em;

    @Override
    public List<Product> findAll(Integer offset, Integer limit) {
        Query query = em.createNamedQuery("Product.findAll", Product.class);
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.getResultList();
    }

    @Override
    public Long findTotal() {
        Query query = em.createNamedQuery("Product.findTotal");
        return (Long) query.getSingleResult();
    }

}
