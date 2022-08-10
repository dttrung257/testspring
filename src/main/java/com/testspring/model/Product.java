package com.testspring.model;

import org.hibernate.annotations.Entity;

import javax.persistence.Id;

// Object created from this class are call POJO - Plain Object Java Object
// Class has full getter and setter, constructor like this.
@Entity
public class Product {
    /**
     * Declare attributes.
     * */
    @Id
    private Long productId;
    private String productName;
    private int year;
    private double productPrice;
    private String productUrl;

    /** Default constructor.*/
    public Product() {

    }

    /** Constructor . */
    public Product(Long productId, String productName, int year, double productPrice, String productUrl) {
        this.productId = productId;
        this.productName = productName;
        this.year = year;
        this.productPrice = productPrice;
        this.productUrl = productUrl;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getYear() {
        return year;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductUrl() {
        return productUrl;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", year=" + year +
                ", productPrice=" + productPrice +
                ", productUrl='" + productUrl + '\'' +
                '}';
    }

    public static void main(String[] args) throws Exception {
        Product p = new Product(1L,
                "Mercedes",
                2020,
                20000,
                "http://google.com");
        System.out.println(p);
    }
}
