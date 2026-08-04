package org.educational.ordermanager.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "produtos")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome")
    private String name;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Category category;

    @Column(name = "preco")
    private double price;

    @ManyToMany(mappedBy = "productsList")
    private List<Order> productOrders;

    @Column(name = "estoque")
    private int stock;

    public Product(long id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productOrders = new ArrayList<>();
        this.stock = stock;
    }

    public Product() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<Order> getProductOrders() {
        return productOrders;
    }

    public int getStock() {
        return stock;
    }
}
