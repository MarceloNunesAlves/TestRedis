package br.com.flexvision;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable{

	private static final long serialVersionUID = -7258002018513999822L;

    private String description;
    private BigDecimal price;

    public Product(String description, BigDecimal price) {
        this.description = description;
        this.price = price;
    }

    public void setDescription(String description){
    	this.description = description;
    }


    public void setPrice(BigDecimal price){
    	this.price = price;
    }


    public String getDescription(){
    	return description;
    }


    public BigDecimal getPrice(){
    	return price;
    }
}
