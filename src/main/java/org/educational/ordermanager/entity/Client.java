package org.educational.ordermanager.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="clientes")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome")
    private String name;

    private String email;

    @OneToMany(mappedBy = "client",fetch = FetchType.EAGER)
    private List<Order> clientOrders;

    @Column(name = "data_cadastro")
    private LocalDate registerDate;

    public Client(long id, String name, String email, LocalDate registerDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.clientOrders = new ArrayList<>();
        this.registerDate = registerDate;
    }

    public Client() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public List<Order> getClientOrders() {
        return clientOrders;
    }


}
