package com.example.ttcm_webbangiay.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "\"Orders\"")
public class OrdersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "orderID")
    private int orderId;
    @Basic
    @Column(name = "create_time")
    private Date createTime;
    @Basic
    @Column(name = "customerID")
    private Integer customerId;
    @Basic
    @Column(name = "is_pay")
    private String isPay;
    @Basic
    @Column(name = "paymentID")
    private Integer paymentId;
    @OneToMany(mappedBy = "ordersByOrderId")
    private Collection<OrderDetailEntity> orderDetailsByOrderId;
    @ManyToOne
    @JoinColumn(name = "paymentID", referencedColumnName = "paymentID", insertable = false, updatable = false)
    private PaymentMethodsEntity paymentMethodsByPaymentId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getIsPay() {
        return isPay;
    }

    public void setIsPay(String isPay) {
        this.isPay = isPay;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersEntity that = (OrdersEntity) o;
        return orderId == that.orderId && Objects.equals(createTime, that.createTime) && Objects.equals(customerId, that.customerId) && Objects.equals(isPay, that.isPay) && Objects.equals(paymentId, that.paymentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, createTime, customerId, isPay, paymentId);
    }

    public Collection<OrderDetailEntity> getOrderDetailsByOrderId() {
        return orderDetailsByOrderId;
    }

    public void setOrderDetailsByOrderId(Collection<OrderDetailEntity> orderDetailsByOrderId) {
        this.orderDetailsByOrderId = orderDetailsByOrderId;
    }

    public PaymentMethodsEntity getPaymentMethodsByPaymentId() {
        return paymentMethodsByPaymentId;
    }

    public void setPaymentMethodsByPaymentId(PaymentMethodsEntity paymentMethodsByPaymentId) {
        this.paymentMethodsByPaymentId = paymentMethodsByPaymentId;
    }
}
