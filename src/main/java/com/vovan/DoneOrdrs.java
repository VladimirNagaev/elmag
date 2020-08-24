package com.vovan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
@Entity
public class DoneOrdrs {
    @Id
    @Column(name = "idOfOrder")
    private  int idOfOrder;
    @Column(name = "adminId")
    private  int adminId;
    @Column(name = "clientId")
    private  int clientId;
    @Column(name = "status")
    private  String status;
    @Column(name = "goodList")
    private List<Good> goodList;

    public DoneOrdrs(int idOfOrder, int adminId, int clientId, String status, List<Good> goodList) {
        this.idOfOrder = idOfOrder;
        this.adminId = adminId;
        this.clientId = clientId;
        this.status = status;
        this.goodList = goodList;
    }

    public DoneOrdrs() {
    }

    public int getIdOfOrder() {
        return idOfOrder;
    }

    public void setIdOfOrder(int idOfOrder) {
        this.idOfOrder = idOfOrder;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Good> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<Good> goodList) {
        this.goodList = goodList;
    }

    @Override
    public String toString() {
        return "DoneOrdrs{" +
                "idOfOrder=" + idOfOrder +
                ", adminId=" + adminId +
                ", clientId=" + clientId +
                ", status='" + status + '\'' +
                ", goodList=" + goodList +
                '}';
    }
}
