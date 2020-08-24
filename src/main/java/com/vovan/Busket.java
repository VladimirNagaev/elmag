package com.vovan;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Busket {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private int id;
    @Column(name = "ClientId")
    private  int clientId;
    @Column(name = "goodList")
    @OneToMany(mappedBy = "id")
    private List<Good> goodList = new ArrayList<>();

    public Busket(int clientId) {
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

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
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
