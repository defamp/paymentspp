package com.example.paymentspp.Model.Petugas;

import com.google.gson.annotations.SerializedName;

public class Petugas {
    @SerializedName("nip")
    private String nip;
    @SerializedName("nama_petugas")
    private String nama_petugas;
    @SerializedName("password")
    private String password;
    @SerializedName("role")
    private String role;

    public Petugas(){

    }
    public Petugas(String nip, String nama_petugas, String password, String role){
        this.nip = nip;
        this.nama_petugas = nama_petugas;
        this.password = password;
        this.role = role;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama_petugas() {
        return nama_petugas;
    }

    public void setNama_petugas(String nama_petugas) {
        this.nama_petugas = nama_petugas;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
