package com.vovan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Good {
    @Id
    @Column(name = "art")
    private int art;
    @Column(name = "price")
    private int price;
    @Column(name = "name")
    private String name;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "quantityOfBooked")
    private int quantityOfBooked;


    public Good(int art, int price, String name) {
        this.art = art;
        this.price = price;
        this.name = name;
    }

    public Good() {
    }

    public Good(int art, int price, String name, int quantity) {
        this.art = art;
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return art == good.art &&
                price == good.price &&
                quantity == good.quantity &&
                quantityOfBooked == good.quantityOfBooked &&
                name.equals(good.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(art, name);
    }

    public int getArt() {
        return art;
    }

    public void setArt(int art) {
        this.art = art;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantityOfBooked() {
        return quantityOfBooked;
    }

    public void setQuantityOfBooked(int quantityOfBooked) {
        this.quantityOfBooked = quantityOfBooked;
    }
}
