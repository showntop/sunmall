package com.wimill.sunmall.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "public.spree_products")
public class Product extends Entity{
    @Id
    private Integer id;

    private String name;

    private String description;

    @Column(name = "available_on")
    private Date availableOn;

    @Column(name = "deleted_at")
    private Date deletedAt;

    private String slug;

    @Column(name = "meta_description")
    private String metaDescription;

    @Column(name = "meta_keywords")
    private String metaKeywords;

    @Column(name = "tax_category_id")
    private Integer taxCategoryId;

    @Column(name = "shipping_category_id")
    private Integer shippingCategoryId;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    private Boolean promotionable;

    @Column(name = "meta_title")
    private String metaTitle;

    @Column(name = "discontinue_on")
    private Date discontinueOn;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * @return available_on
     */
    public Date getAvailableOn() {
        return availableOn;
    }

    /**
     * @param availableOn
     */
    public void setAvailableOn(Date availableOn) {
        this.availableOn = availableOn;
    }

    /**
     * @return deleted_at
     */
    public Date getDeletedAt() {
        return deletedAt;
    }

    /**
     * @param deletedAt
     */
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * @return slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * @param slug
     */
    public void setSlug(String slug) {
        this.slug = slug == null ? null : slug.trim();
    }

    /**
     * @return meta_description
     */
    public String getMetaDescription() {
        return metaDescription;
    }

    /**
     * @param metaDescription
     */
    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription == null ? null : metaDescription.trim();
    }

    /**
     * @return meta_keywords
     */
    public String getMetaKeywords() {
        return metaKeywords;
    }

    /**
     * @param metaKeywords
     */
    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords == null ? null : metaKeywords.trim();
    }

    /**
     * @return tax_category_id
     */
    public Integer getTaxCategoryId() {
        return taxCategoryId;
    }

    /**
     * @param taxCategoryId
     */
    public void setTaxCategoryId(Integer taxCategoryId) {
        this.taxCategoryId = taxCategoryId;
    }

    /**
     * @return shipping_category_id
     */
    public Integer getShippingCategoryId() {
        return shippingCategoryId;
    }

    /**
     * @param shippingCategoryId
     */
    public void setShippingCategoryId(Integer shippingCategoryId) {
        this.shippingCategoryId = shippingCategoryId;
    }

    /**
     * @return created_at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return updated_at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return promotionable
     */
    public Boolean getPromotionable() {
        return promotionable;
    }

    /**
     * @param promotionable
     */
    public void setPromotionable(Boolean promotionable) {
        this.promotionable = promotionable;
    }

    /**
     * @return meta_title
     */
    public String getMetaTitle() {
        return metaTitle;
    }

    /**
     * @param metaTitle
     */
    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle == null ? null : metaTitle.trim();
    }

    /**
     * @return discontinue_on
     */
    public Date getDiscontinueOn() {
        return discontinueOn;
    }

    /**
     * @param discontinueOn
     */
    public void setDiscontinueOn(Date discontinueOn) {
        this.discontinueOn = discontinueOn;
    }
}