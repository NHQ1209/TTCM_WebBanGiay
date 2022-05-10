package com.example.ttcm_webbangiay.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "\"User\"")
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_name")
    private String userName;
    @Basic
    @Column(name = "password")
    private Integer password;
    @Basic
    @Column(name = "is_admin")
    private String isAdmin;
    @OneToMany(mappedBy = "userByUserName")
    private Collection<BlogEntity> blogsByUserName;
    @OneToMany(mappedBy = "userByUserName")
    private Collection<CustomerEntity> customersByUserName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(userName, that.userName) && Objects.equals(password, that.password) && Objects.equals(isAdmin, that.isAdmin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password, isAdmin);
    }

    public Collection<BlogEntity> getBlogsByUserName() {
        return blogsByUserName;
    }

    public void setBlogsByUserName(Collection<BlogEntity> blogsByUserName) {
        this.blogsByUserName = blogsByUserName;
    }

    public Collection<CustomerEntity> getCustomersByUserName() {
        return customersByUserName;
    }

    public void setCustomersByUserName(Collection<CustomerEntity> customersByUserName) {
        this.customersByUserName = customersByUserName;
    }
}
