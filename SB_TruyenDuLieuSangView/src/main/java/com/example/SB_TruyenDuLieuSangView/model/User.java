package com.example.SB_TruyenDuLieuSangView.model;

public class User {
    private String mssv , username , gioiTinh;
    private int namSinh;

    public User(){

    }
    public User(String mssv, String username, String gioiTinh, int namSinh) {
        this.mssv = mssv;
        this.username = username;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
}
