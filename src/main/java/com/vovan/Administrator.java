package com.vovan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Administrator {
    @Id
    @Column(name = "adminId")
    private  int adminId;
    @Column(name = "contacts")
    private String contacts;
    @Column(name = "login")
    private String login;
    @Column(name = "hashOfPassword")
    private String hashOfPassword;

    public Administrator() {
    }

    public Administrator(String contacts, String login, String hashOfPassword) {
        this.contacts = contacts;
        this.login = login;
        this.hashOfPassword = hashOfPassword;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "adminId=" + adminId +
                ", contacts='" + contacts + '\'' +
                ", login='" + login + '\'' +
                ", hashOfPassword='" + hashOfPassword + '\'' +
                '}';
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHashOfPassword() {
        return hashOfPassword;
    }

    public void setHashOfPassword(String hashOfPassword) {
        this.hashOfPassword = hashOfPassword;
    }
}
