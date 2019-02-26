package com.epam.ProductsReview.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalTime;

/**
 * Created by saurabh on 26/2/19.
 */
@Entity
@Table(name="products")
public class Product implements Serializable{

    @Id
    @GeneratedValue
    private Long productId;
    private String name;
    private float price;
    private String category;
   // private LocalTime createTime;
   // private LocalTime updateTime;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override

    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
               // ", createTime=" + createTime +
               // ", updateTime=" + updateTime +
                '}';
    }
}
