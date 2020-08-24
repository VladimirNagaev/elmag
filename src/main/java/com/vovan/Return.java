package com.vovan;

import javax.persistence.*;
import java.util.Map;
@Entity
public class Return {

    @Id
    @GeneratedValue
    @Column(name = "")
    private int id;
    @Column(name = "adminId")
    private int adminId;
    @Column(name = "isSelfShipped")
    private boolean isSelfShipped;
    @Column(name = "trackCode")
    private String trackCode;
    @Column(name = "sippingCompany")
    private String sippingCompany;
    @Column(name = "mapOfGoods")
    @OneToMany(cascade = CascadeType.ALL)
    
    private Map<Integer, Good> mapOfGoods;

    public Return(int id, boolean isSelfShipped, Map<Integer, Good> mapOfGoods) {
        this.id = id;
        this.isSelfShipped = isSelfShipped;
        this.mapOfGoods = mapOfGoods;
    }

    public Return() {
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public boolean isSelfShipped() {
        return isSelfShipped;
    }

    public void setSelfShipped(boolean selfShipped) {
        isSelfShipped = selfShipped;
    }

    public String getTrackCode() {
        return trackCode;
    }

    public void setTrackCode(String trackCode) {
        this.trackCode = trackCode;
    }

    public String getSippingCompany() {
        return sippingCompany;
    }

    public void setSippingCompany(String sippingCompany) {
        this.sippingCompany = sippingCompany;
    }

    public Map<Integer, Good> getMapOfGoods() {
        return mapOfGoods;
    }

    public void setMapOfGoods(Map<Integer, Good> mapOfGoods) {
        this.mapOfGoods = mapOfGoods;
    }

    @Override
    public String toString() {
        return "Return {" +
                "id=" + id +
                ", adminId=" + adminId +
                ", isSelfShipped=" + isSelfShipped +
                ", trackCode='" + trackCode + '\'' +
                ", sippingCompany='" + sippingCompany + '\'' +
                ", mapOfGoods=" + mapOfGoods +
                '}';
    }
}
