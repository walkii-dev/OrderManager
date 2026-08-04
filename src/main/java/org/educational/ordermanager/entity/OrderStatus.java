package org.educational.ordermanager.entity;

import jakarta.persistence.EnumeratedValue;

public enum OrderStatus {
    SEND("Enviado"),
    DELIVERED("Entregue"),
    PENDING("Pendente");

    OrderStatus(String status) {
        this.status = status;
    }
    @EnumeratedValue
    public final String status;
}
