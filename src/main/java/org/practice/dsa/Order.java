package org.practice.dsa;

import java.time.LocalDateTime;

public class Order {
    public Order(String orderId, String[] items, LocalDateTime dateOfOrder) {
        this.orderId = orderId;
        this.itesm = items;
        this.dateOfOrder = dateOfOrder;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(LocalDateTime dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String[] getItesm() {
        return itesm;
    }

    public void setItesm(String[] itesm) {
        this.itesm = itesm;
    }

    private  String orderId;
    private String[] itesm;
    private LocalDateTime dateOfOrder;



}
