package com.wimill.sunmall.model;

import java.util.Date;

public class Product extends Item{
    private Integer id;

    private String name;

    private String description;

    private Date availableOn;

    private Date deletedAt;

    private String slug;

    private String metaDescription;

    private String metaKeywords;

    private Integer taxCategoryId;

    private Integer shippingCategoryId;

    private Date createdAt;

    private Date updatedAt;

    private Boolean promotionable;

    private String metaTitle;

    private Date discontinueOn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getAvailableOn() {
        return availableOn;
    }

    public void setAvailableOn(Date availableOn) {
        this.availableOn = availableOn;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug == null ? null : slug.trim();
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription == null ? null : metaDescription.trim();
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords == null ? null : metaKeywords.trim();
    }

    public Integer getTaxCategoryId() {
        return taxCategoryId;
    }

    public void setTaxCategoryId(Integer taxCategoryId) {
        this.taxCategoryId = taxCategoryId;
    }

    public Integer getShippingCategoryId() {
        return shippingCategoryId;
    }

    public void setShippingCategoryId(Integer shippingCategoryId) {
        this.shippingCategoryId = shippingCategoryId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getPromotionable() {
        return promotionable;
    }

    public void setPromotionable(Boolean promotionable) {
        this.promotionable = promotionable;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle == null ? null : metaTitle.trim();
    }

    public Date getDiscontinueOn() {
        return discontinueOn;
    }

    public void setDiscontinueOn(Date discontinueOn) {
        this.discontinueOn = discontinueOn;
    }
}