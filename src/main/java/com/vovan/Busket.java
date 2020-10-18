package com.vovan;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
public class Busket {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private int id;
    //@Column(name = "ClientId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ClientId")
    private  Client clientId;
    @ElementCollection
    private List<Good> goodList = new ArrayList<>();

    public Busket(Client clientId) {
        this.clientId = clientId;
    }

    public Busket() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public List<Good> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<Good> goodList) {
        this.goodList = goodList;
    }

    @Override
    public String toString() {
        return "Busket{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", goodList=" + goodList +
                '}';
    }

    public boolean add (Good addingGood){
        /* if it good booked quantity less than quantity of all
        *  book it
        * change booked quantity
        *
        *   and rewrite to exception
        *
        *  */

        if (!goodList.isEmpty()  ){
            int prevSize = goodList.size();
            goodList.add(addingGood);
            return prevSize < goodList.size();
        }else {
            goodList.add(addingGood);
            return !goodList.isEmpty();
        }

    }
}
