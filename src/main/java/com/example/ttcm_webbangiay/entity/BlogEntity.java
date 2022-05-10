package com.example.ttcm_webbangiay.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "\"Blog\"")
public class BlogEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "blogID")
    private int blogId;
    @Basic
    @Column(name = "blog_title")
    private String blogTitle;
    @Basic
    @Column(name = "blog_body")
    private String blogBody;
    @Basic
    @Column(name = "blog_date")
    private Date blogDate;
    @Basic
    @Column(name = "user_name")
    private String userName;
    @Basic
    @Column(name = "tags")
    private String tags;
    @ManyToOne
    @JoinColumn(name = "user_name", referencedColumnName = "user_name", insertable = false, updatable = false)
    private UserEntity userByUserName;

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogBody() {
        return blogBody;
    }

    public void setBlogBody(String blogBody) {
        this.blogBody = blogBody;
    }

    public Date getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(Date blogDate) {
        this.blogDate = blogDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogEntity that = (BlogEntity) o;
        return blogId == that.blogId && Objects.equals(blogTitle, that.blogTitle) && Objects.equals(blogBody, that.blogBody) && Objects.equals(blogDate, that.blogDate) && Objects.equals(userName, that.userName) && Objects.equals(tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blogId, blogTitle, blogBody, blogDate, userName, tags);
    }

    public UserEntity getUserByUserName() {
        return userByUserName;
    }

    public void setUserByUserName(UserEntity userByUserName) {
        this.userByUserName = userByUserName;
    }
}
