package com.example.ttcm_webbangiay.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "\"Customer\"")
public class CustomerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "customerID")
    private int customerId;
    @Basic
    @Column(name = "customer_name")
    private String customerName;
    @Basic
    @Column(name = "customer_phone")
    private Integer customerPhone;
    @Basic
    @Column(name = "customer_email")
    private String customerEmail;
    @Basic
    @Column(name = "user_name")
    private String userName;
    @ManyToOne
    @JoinColumn(name = "user_name", referencedColumnName = "user_name", insertable = false, updatable = false)
    private UserEntity userByUserName;
    @OneToMany(mappedBy = "customerByCustomerId")
    private Collection<CustomerReviewsEntity> customerReviewsByCustomerId;
    @OneToMany(mappedBy = "customerByCustomerId")
    private Collection<WishListEntity> wishListsByCustomerId;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(Integer customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerEntity that = (CustomerEntity) o;
        return customerId == that.customerId && Objects.equals(customerName, that.customerName) && Objects.equals(customerPhone, that.customerPhone) && Objects.equals(customerEmail, that.customerEmail) && Objects.equals(userName, that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerName, customerPhone, customerEmail, userName);
    }

    public UserEntity getUserByUserName() {
        return userByUserName;
    }

    public void setUserByUserName(UserEntity userByUserName) {
        this.userByUserName = userByUserName;
    }

    public Collection<CustomerReviewsEntity> getCustomerReviewsByCustomerId() {
        return customerReviewsByCustomerId;
    }

    public void setCustomerReviewsByCustomerId(Collection<CustomerReviewsEntity> customerReviewsByCustomerId) {
        this.customerReviewsByCustomerId = customerReviewsByCustomerId;
    }

    public Collection<WishListEntity> getWishListsByCustomerId() {
        return wishListsByCustomerId;
    }

    public void setWishListsByCustomerId(Collection<WishListEntity> wishListsByCustomerId) {
        this.wishListsByCustomerId = wishListsByCustomerId;
    }
}
