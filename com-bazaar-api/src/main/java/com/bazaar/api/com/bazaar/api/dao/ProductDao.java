/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bazaar.api.com.bazaar.api.dao;

import com.bazaar.api.com.bazaar.api.model.Product;
import java.util.List;

/**
 *
 * @author Borja
 */
public interface ProductDao {
    
    public List<Product> findAll(Integer offset, Integer limit);
    
    public Long findTotal();
    
}
