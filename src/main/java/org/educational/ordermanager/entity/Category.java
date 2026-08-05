package org.educational.ordermanager.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categorias")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name ="nome")
    private String name;

    public Category(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
