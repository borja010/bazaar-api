/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bazaar.api.com.bazaar.api.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Borja
 */
@Entity
@Table(name = "product_detail_grouper")
public class ProductDetailGrouper implements Serializable {

    @Id
    @Column(name = "product_detail_grouper_id")
    private Integer productDetailGrouperId;

    @Column(name = "description")
    private String description;

    public Integer getProductDetailGrouperId() {
        return productDetailGrouperId;
    }

    public void setProductDetailGrouperId(Integer productDetailGrouperId) {
        this.productDetailGrouperId = productDetailGrouperId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductDetailGrouper{" + "productDetailGrouperId=" + productDetailGrouperId + ", description=" + description + '}';
    }

}
