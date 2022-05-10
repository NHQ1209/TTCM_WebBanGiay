package com.example.ttcm_webbangiay.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "\"WishList\"")
public class WishListEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "wishlistID")
    private int wishlistId;
    @Basic
    @Column(name = "productID")
    private Integer productId;
    @Basic
    @Column(name = "customerID")
    private Integer customerId;
    @ManyToOne
    @JoinColumn(name = "productID", referencedColumnName = "productID", insertable = false, updatable = false)
    private ProductEntity productByProductId;
    @ManyToOne
    @JoinColumn(name = "customerID", referencedColumnName = "customerID", insertable = false, updatable = false)
    private CustomerEntity customerByCustomerId;

    public int getWishlistId() {
        return wishlistId;
    }

    public void setWishlistId(int wishlistId) {
        this.wishlistId = wishlistId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WishListEntity that = (WishListEntity) o;
        return wishlistId == that.wishlistId && Objects.equals(productId, that.productId) && Objects.equals(customerId, that.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wishlistId, productId, customerId);
    }

    public ProductEntity getProductByProductId() {
        return productByProductId;
    }

    public void setProductByProductId(ProductEntity productByProductId) {
        this.productByProductId = productByProductId;
    }

    public CustomerEntity getCustomerByCustomerId() {
        return customerByCustomerId;
    }

    public void setCustomerByCustomerId(CustomerEntity customerByCustomerId) {
        this.customerByCustomerId = customerByCustomerId;
    }
}
