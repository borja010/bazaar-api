/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bazaar.api.com.bazaar.api.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;

/**
 *
 * @author Borja
 */
public class ProductDetailPK implements Serializable {

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "key")
    private String key;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.productId);
        hash = 59 * hash + Objects.hashCode(this.key);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductDetailPK other = (ProductDetailPK) obj;
        if (!Objects.equals(this.key, other.key)) {
            return false;
        }
        if (!Objects.equals(this.productId, other.productId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductDetailPK{" + "productId=" + productId + ", key=" + key + '}';
    }

}
