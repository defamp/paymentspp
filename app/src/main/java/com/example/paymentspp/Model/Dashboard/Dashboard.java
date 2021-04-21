package com.example.paymentspp.Model.Dashboard;

import com.google.gson.annotations.SerializedName;

public class Dashboard {
    @SerializedName("nis")
    private String nis;
    @SerializedName("id_spp")
    private int id_spp;
    @SerializedName("tanggal_bayar")
    private String tanggal_bayar;

    public Dashboard(){

    }
    public Dashboard(int no_struk, String nip, String nis, int id_spp, String tanggal_bayar, String file){
        this.nis = nis;
        this.id_spp = id_spp;
        this.tanggal_bayar = tanggal_bayar;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public int getId_spp() {
        return id_spp;
    }

    public void setId_spp(int id_spp) {
        this.id_spp = id_spp;
    }

    public String getTanggal_bayar() {
        return tanggal_bayar;
    }

    public void setTanggal_bayar(String tanggal_bayar) {
        this.tanggal_bayar = tanggal_bayar;
    }
}
