package com.example.ttcm_webbangiay.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "\"PaymentMethods\"")
public class PaymentMethodsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "paymentID")
    private int paymentId;
    @Basic
    @Column(name = "payment_name")
    private String paymentName;
    @OneToMany(mappedBy = "paymentMethodsByPaymentId")
    private Collection<OrdersEntity> ordersByPaymentId;

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentMethodsEntity that = (PaymentMethodsEntity) o;
        return paymentId == that.paymentId && Objects.equals(paymentName, that.paymentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentId, paymentName);
    }

    public Collection<OrdersEntity> getOrdersByPaymentId() {
        return ordersByPaymentId;
    }

    public void setOrdersByPaymentId(Collection<OrdersEntity> ordersByPaymentId) {
        this.ordersByPaymentId = ordersByPaymentId;
    }
}
