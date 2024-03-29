package com.polystorage.entity;
// Generated Nov 22, 2019 11:47:05 PM by Hibernate Tools 4.3.1

/**
 * ChitietdonnhapId generated by hbm2java
 */
public class ChiTietDonNhapId implements java.io.Serializable {

    private int maDN;
    private String maSP;

    public ChiTietDonNhapId() {
    }

    public ChiTietDonNhapId(int maDn, String maSp) {
        this.maDN = maDn;
        this.maSP = maSp;
    }

    public int getMaDN() {
        return maDN;
    }

    public void setMaDN(int maDN) {
        this.maDN = maDN;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof ChiTietDonNhapId)) {
            return false;
        }
        ChiTietDonNhapId castOther = (ChiTietDonNhapId) other;

        return (this.getMaDN() == castOther.getMaDN())
                && ((this.getMaSP() == castOther.getMaSP()) || (this.getMaSP() != null && castOther.getMaSP() != null && this.getMaSP().equals(castOther.getMaSP())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getMaDN();
        result = 37 * result + (getMaSP() == null ? 0 : this.getMaSP().hashCode());
        return result;
    }

}
