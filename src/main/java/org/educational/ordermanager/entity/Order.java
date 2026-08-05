package org.educational.ordermanager.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pedidos")
public class Order {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id")
    private Client client;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Product> productsList;

    @Column(name = "quantidade")
    private int quantity;

    @Column(name="data_pedido")
    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    public Order(long id, Client client, int quantity, OrderStatus status) {
        this.id = id;
        this.client = client;
        this.productsList = new ArrayList<>();
        this.quantity = quantity;
        this.orderDate = LocalDateTime.now();
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

    public List<Product> getProductsList() {
        return productsList;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
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

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", client=" + client +
                ", productsList=" + productsList +
                ", quantity=" + quantity +
                ", orderDate=" + orderDate +
                ", status=" + status +
                '}';
    }
}
