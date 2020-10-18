package com.vovan;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.Objects;
@Entity
public class OrdersInWork {
    @Id
    @Column(name = "Id")
    private int id;
    @Column(name = "clientId")
    private int clientId;
    @Column(name = "adminId")
    private int adminId;
    @Column(name = "price")
    private int price;
    @Column(name = "shipmentCompany")
    private String shipmentCompany;
    @Column(name = "isSelfShipment")
    private boolean isSelfShipment;
    @Column(name = "isPayed")
    private boolean isPayed;
    @ElementCollection
    private List<Good> goodList;

    public OrdersInWork(int id, int clientId, int adminId, String shipmentCompany, boolean isSelfShipment, List<Good> goodList) {
        this.id = id;
        this.clientId = clientId;
        this.adminId = adminId;
        this.shipmentCompany = shipmentCompany;
        this.isSelfShipment = isSelfShipment;
        this.goodList = goodList;
    }

    public OrdersInWork() {
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

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getShipmentCompany() {
        return shipmentCompany;
    }

    public void setShipmentCompany(String shipmentCompany) {
        this.shipmentCompany = shipmentCompany;
    }

    public boolean isSelfShipment() {
        return isSelfShipment;
    }

    public void setSelfShipment(boolean selfShipment) {
        isSelfShipment = selfShipment;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public List<Good> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<Good> goodList) {
        this.goodList = goodList;
    }

    @Override
    public String toString() {
        return "OrdersInWork{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", adminId=" + adminId +
                ", price=" + price +
                ", shipmentCompany='" + shipmentCompany + '\'' +
                ", isSelfShipment=" + isSelfShipment +
                ", isPayed=" + isPayed +
                ", goodList=" + goodList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrdersInWork)) return false;
        OrdersInWork that = (OrdersInWork) o;
        return getId() == that.getId() &&
                getClientId() == that.getClientId() &&
                getAdminId() == that.getAdminId() &&
                getPrice() == that.getPrice() &&
                isSelfShipment() == that.isSelfShipment() &&
                isPayed() == that.isPayed() &&
                Objects.equals(getShipmentCompany(), that.getShipmentCompany()) &&
                getGoodList().equals(that.getGoodList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getClientId(), getAdminId(), getPrice(), getShipmentCompany(), isSelfShipment(), isPayed(), getGoodList());
    }
}
