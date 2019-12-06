package com.polystorage.entity;
// Generated Nov 22, 2019 11:47:05 PM by Hibernate Tools 4.3.1

/**
 * Chitietdonnhap generated by hbm2java
 */
public class ChiTietDonNhap implements java.io.Serializable {

    private ChiTietDonNhapId id;
    private DonNhap donNhap;
    private SanPham sanPham;
    private int soLuong;

    public ChiTietDonNhap() {
    }

    public ChiTietDonNhap(ChiTietDonNhapId id, DonNhap donnhap, SanPham sanpham, int soLuong) {
        this.id = id;
        this.donNhap = donnhap;
        this.sanPham = sanpham;
        this.soLuong = soLuong;
    }

    public ChiTietDonNhapId getId() {
        return id;
    }

    public void setId(ChiTietDonNhapId id) {
        this.id = id;
    }

    public DonNhap getDonNhap() {
        return donNhap;
    }

    public void setDonNhap(DonNhap donNhap) {
        this.donNhap = donNhap;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

}