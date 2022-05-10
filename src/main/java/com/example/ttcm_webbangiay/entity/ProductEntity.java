package com.example.ttcm_webbangiay.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "\"Product\"")
public class ProductEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "productID")
    private int productId;
    @Basic
    @Column(name = "product_name")
    private String productName;
    @Basic
    @Column(name = "product_price")
    private Integer productPrice;
    @Basic
    @Column(name = "product_quantity")
    private Integer productQuantity;
    @Basic
    @Column(name = "product_size")
    private Integer productSize;
    @Basic
    @Column(name = "product_description")
    private String productDescription;
    @Basic
    @Column(name = "product_rating")
    private Integer productRating;
    @Basic
    @Column(name = "categoryID")
    private Integer categoryId;
    @Basic
    @Column(name = "amount_sold")
    private Integer amountSold;
    @Basic
    @Column(name = "create_time")
    private Date createTime;
    @OneToMany(mappedBy = "productByProductId")
    private Collection<CustomerReviewsEntity> customerReviewsByProductId;
    @OneToMany(mappedBy = "productByProductId")
    private Collection<OrderDetailEntity> orderDetailsByProductId;
    @ManyToOne
    @JoinColumn(name = "categoryID", referencedColumnName = "categoryID", insertable = false, updatable = false)
    private CategoriesEntity categoriesByCategoryId;
    @OneToMany(mappedBy = "productByProductId")
    private Collection<ProductImageEntity> productImagesByProductId;
    @OneToMany(mappedBy = "productByProductId")
    private Collection<WishListEntity> wishListsByProductId;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Integer getProductSize() {
        return productSize;
    }

    public void setProductSize(Integer productSize) {
        this.productSize = productSize;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getProductRating() {
        return productRating;
    }

    public void setProductRating(Integer productRating) {
        this.productRating = productRating;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getAmountSold() {
        return amountSold;
    }

    public void setAmountSold(Integer amountSold) {
        this.amountSold = amountSold;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return productId == that.productId && Objects.equals(productName, that.productName) && Objects.equals(productPrice, that.productPrice) && Objects.equals(productQuantity, that.productQuantity) && Objects.equals(productSize, that.productSize) && Objects.equals(productDescription, that.productDescription) && Objects.equals(productRating, that.productRating) && Objects.equals(categoryId, that.categoryId) && Objects.equals(amountSold, that.amountSold) && Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, productPrice, productQuantity, productSize, productDescription, productRating, categoryId, amountSold, createTime);
    }

    public Collection<CustomerReviewsEntity> getCustomerReviewsByProductId() {
        return customerReviewsByProductId;
    }

    public void setCustomerReviewsByProductId(Collection<CustomerReviewsEntity> customerReviewsByProductId) {
        this.customerReviewsByProductId = customerReviewsByProductId;
    }

    public Collection<OrderDetailEntity> getOrderDetailsByProductId() {
        return orderDetailsByProductId;
    }

    public void setOrderDetailsByProductId(Collection<OrderDetailEntity> orderDetailsByProductId) {
        this.orderDetailsByProductId = orderDetailsByProductId;
    }

    public CategoriesEntity getCategoriesByCategoryId() {
        return categoriesByCategoryId;
    }

    public void setCategoriesByCategoryId(CategoriesEntity categoriesByCategoryId) {
        this.categoriesByCategoryId = categoriesByCategoryId;
    }

    public Collection<ProductImageEntity> getProductImagesByProductId() {
        return productImagesByProductId;
    }

    public void setProductImagesByProductId(Collection<ProductImageEntity> productImagesByProductId) {
        this.productImagesByProductId = productImagesByProductId;
    }

    public Collection<WishListEntity> getWishListsByProductId() {
        return wishListsByProductId;
    }

    public void setWishListsByProductId(Collection<WishListEntity> wishListsByProductId) {
        this.wishListsByProductId = wishListsByProductId;
    }
}
