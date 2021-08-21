/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bazaar.api.com.bazaar.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Borja
 */
@Entity
@Table(name = "product_detail")
@IdClass(ProductDetailPK.class)
public class ProductDetail implements Serializable {

    @Id
    @Column(name = "product_id")
    @JsonIgnore
    private Integer productId;

    @Id
    @Column(name = "key")
    private String key;

    @Column(name = "value")
    private String value;

    @ManyToOne
    @JoinColumn(name = "product_detail_grouper_id", referencedColumnName = "product_detail_grouper_id", insertable = false, updatable = false)
    private ProductDetailGrouper productDetailGrouper;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ProductDetailGrouper getProductDetailGrouper() {
        return productDetailGrouper;
    }

    public void setProductDetailGrouper(ProductDetailGrouper productDetailGrouper) {
        this.productDetailGrouper = productDetailGrouper;
    }

    @Override
    public String toString() {
        return "ProductDetail{" + "productId=" + productId + ", key=" + key + ", value=" + value + ", productDetailGrouper=" + productDetailGrouper + '}';
    }

}
