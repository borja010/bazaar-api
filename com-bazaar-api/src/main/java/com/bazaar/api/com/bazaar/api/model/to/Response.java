/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bazaar.api.com.bazaar.api.model.to;

/**
 *
 * @author Borja
 */
public class Response {

    private Object data;

    private Integer code;

    private String message;

    public Response(Object data, Integer code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }
    
    

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
