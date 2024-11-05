/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class TaiKhoan {
    private String tenDN;
    private String MK;

    public TaiKhoan() {
    }

    public TaiKhoan(String tenDN, String MK) {
        this.tenDN = tenDN;
        this.MK = MK;
    }

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getMK() {
        return MK;
    }

    public void setMK(String MK) {
        this.MK = MK;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "ten\u0110N=" + tenDN + ", MK=" + MK + '}';
    }   
}
