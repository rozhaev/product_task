package com.sparkequation.spring.trial.api.dto;

import com.sparkequation.spring.trial.api.model.Brand;
import com.sparkequation.spring.trial.api.model.Category;

import java.util.Date;
import java.util.Set;

public class ProductDTO {

    private int id;
    private String name;
    private boolean featured;
    private Date expirationDate;
    private int itemsInStock;
    private Date receiptDate;
    private double rating;

    private Long brandId;
    private Set<Long> categoryIds;

    public ProductDTO(int id, String name, boolean featured, Date expirationDate,
                      int itemsInStock, Date receiptDate, double rating, Long brandId, Set<Long> categoryIds) {
        this.id = id;
        this.name = name;
        this.featured = featured;
        this.expirationDate = expirationDate;
        this.itemsInStock = itemsInStock;
        this.receiptDate = receiptDate;
        this.rating = rating;
        this.brandId = brandId;
        this.categoryIds = categoryIds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFeatured() {
        return featured;
    }

    public void setFeatured(boolean featured) {
        this.featured = featured;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getItemsInStock() {
        return itemsInStock;
    }

    public void setItemsInStock(int itemsInStock) {
        this.itemsInStock = itemsInStock;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Set<Long> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(Set<Long> categoryIds) {
        this.categoryIds = categoryIds;
    }
}
