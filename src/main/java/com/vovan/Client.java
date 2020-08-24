package com.vovan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {


    @Id
    @GeneratedValue
    @Column(name = "Id")
    private int id;
    @Column(name = "email")
    private String eMail;
    @Column(name = "phonenumber")
    private String phoneNumber;
    @Column(name = "name")
    private String name;
    @Column(name = "login")
    private String login;
    @Column(name = "passwordHash")
    private String passwordHash;
    @Column(name = "addressOfDeliver")
    private String addressOfDelivery;
    @Column(name = "receiverName")
    private String receiverName;
    @Column(name = "saleCoefficient")
    private int saleCoefficient;


    public Client(String eMail, String phoneNumber, String name, String login, String passwordHash, String addressOfDelivery, String receiverName, int saleCoefficient) {
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.login = login;
        this.passwordHash = passwordHash;
        this.addressOfDelivery = addressOfDelivery;
        this.receiverName = receiverName;
        this.saleCoefficient = saleCoefficient;
    }

    public Client(int id) {
        this.id = id;
        this.saleCoefficient = 1;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", eMail='" + eMail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", login='" + login + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", addressOfDelivery='" + addressOfDelivery + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", saleCoefficient=" + saleCoefficient +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getAddressOfDelivery() {
        return addressOfDelivery;
    }

    public void setAddressOfDelivery(String addressOfDelivery) {
        this.addressOfDelivery = addressOfDelivery;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public int getSaleCoefficient() {
        return saleCoefficient;
    }

    public void setSaleCoefficient(int saleCoefficient) {
        this.saleCoefficient = saleCoefficient;
    }


}
