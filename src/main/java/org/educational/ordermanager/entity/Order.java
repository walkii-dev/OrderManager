package org.educational.ordermanager.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pedidos")
public class Order {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Client client;

    @ManyToMany
    private List<Product> productsList;

    @Column(name = "quantidade")
    private int quantity;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    public Order(long id, Client client, int quantity, OrderStatus status) {
        this.id = id;
        this.client = client;
        this.productsList = new ArrayList<>();
        this.quantity = quantity;
        this.status = status;
    }

    public Order() {
    }


    public long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public List<Product> getProduct() {
        return productsList;
    }

    public int getQuantity() {
        return quantity;
    }

    public OrderStatus getStatus() {
        return status;
    }
}
