package com.polystorage.entity;
// Generated Nov 22, 2019 11:47:05 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Donnhap generated by hbm2java
 */
public class DonNhap  implements java.io.Serializable {


     private Integer maDN;
     private Kho kho;
     private NhaCungCap nhaCungCap;
     private NhanVien nhanvien;
     private Date ngayNhap;
     private boolean trangThai;
     private String ghiChu;
     private Set chitietdonnhaps = new HashSet(0);

    public DonNhap() {
    }

	
    public DonNhap(Kho kho, NhaCungCap nhacungcap, NhanVien nhanvien, Date ngayNhap, boolean trangThai) {
        this.kho = kho;
        this.nhaCungCap = nhacungcap;
        this.nhanvien = nhanvien;
        this.ngayNhap = ngayNhap;
        this.trangThai = trangThai;
    }
    public DonNhap(Kho kho, NhaCungCap nhacungcap, NhanVien nhanvien, Date ngayNhap, boolean trangThai, String ghiChu, Set chitietdonnhaps) {
       this.kho = kho;
       this.nhaCungCap = nhacungcap;
       this.nhanvien = nhanvien;
       this.ngayNhap = ngayNhap;
       this.trangThai = trangThai;
       this.ghiChu = ghiChu;
       this.chitietdonnhaps = chitietdonnhaps;
    }
   
    public Integer getMaDN() {
        return this.maDN;
    }
    
    public void setMaDN(Integer maDn) {
        this.maDN = maDn;
    }
    public Kho getKho() {
        return this.kho;
    }
    
    public void setKho(Kho kho) {
        this.kho = kho;
    }
    public NhaCungCap getNhaCungCap() {
        return this.nhaCungCap;
    }
    
    public void setNhaCungCap(NhaCungCap nhacungcap) {
        this.nhaCungCap = nhacungcap;
    }
    public NhanVien getNhanvien() {
        return this.nhanvien;
    }
    
    public void setNhanvien(NhanVien nhanvien) {
        this.nhanvien = nhanvien;
    }
    public Date getNgayNhap() {
        return this.ngayNhap;
    }
    
    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    public boolean isTrangThai() {
        return this.trangThai;
    }
    
    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    public String getGhiChu() {
        return this.ghiChu;
    }
    
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    public Set getChitietdonnhaps() {
        return this.chitietdonnhaps;
    }
    
    public void setChitietdonnhaps(Set chitietdonnhaps) {
        this.chitietdonnhaps = chitietdonnhaps;
    }




}
