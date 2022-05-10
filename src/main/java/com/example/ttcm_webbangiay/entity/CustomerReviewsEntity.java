package com.example.ttcm_webbangiay.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "\"CustomerReviews\"")
public class CustomerReviewsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "reviewID")
    private int reviewId;
    @Basic
    @Column(name = "customerID")
    private Integer customerId;
    @Basic
    @Column(name = "productID")
    private Integer productId;
    @Basic
    @Column(name = "rating")
    private Integer rating;
    @Basic
    @Column(name = "review_title")
    private String reviewTitle;
    @Basic
    @Column(name = "review_body")
    private String reviewBody;
    @Basic
    @Column(name = "review_date")
    private Date reviewDate;
    @ManyToOne
    @JoinColumn(name = "customerID", referencedColumnName = "customerID", insertable = false, updatable = false)
    private CustomerEntity customerByCustomerId;
    @ManyToOne
    @JoinColumn(name = "productID", referencedColumnName = "productID", insertable = false, updatable = false)
    private ProductEntity productByProductId;

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    public String getReviewBody() {
        return reviewBody;
    }

    public void setReviewBody(String reviewBody) {
        this.reviewBody = reviewBody;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerReviewsEntity that = (CustomerReviewsEntity) o;
        return reviewId == that.reviewId && Objects.equals(customerId, that.customerId) && Objects.equals(productId, that.productId) && Objects.equals(rating, that.rating) && Objects.equals(reviewTitle, that.reviewTitle) && Objects.equals(reviewBody, that.reviewBody) && Objects.equals(reviewDate, that.reviewDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewId, customerId, productId, rating, reviewTitle, reviewBody, reviewDate);
    }

    public CustomerEntity getCustomerByCustomerId() {
        return customerByCustomerId;
    }

    public void setCustomerByCustomerId(CustomerEntity customerByCustomerId) {
        this.customerByCustomerId = customerByCustomerId;
    }

    public ProductEntity getProductByProductId() {
        return productByProductId;
    }

    public void setProductByProductId(ProductEntity productByProductId) {
        this.productByProductId = productByProductId;
    }
}
