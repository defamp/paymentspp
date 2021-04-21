package com.example.paymentspp.Model.SPP;

import com.google.gson.annotations.SerializedName;

public class SPP {
    @SerializedName("id_spp")
    private int id_spp;
    @SerializedName("tahun_ajaran")
    private String tahun_ajaran;
    @SerializedName("nominal")
    private int nominal;

    public SPP(){

    }
    public SPP(int id_spp, String tahun_ajaran, int nominal){
        this.id_spp = id_spp;
        this.tahun_ajaran = tahun_ajaran;
        this.nominal = nominal;
    }

    public int getId_spp() {
        return id_spp;
    }

    public void setId_spp(int id_spp) {
        this.id_spp = id_spp;
    }

    public String getTahun_ajaran() {
        return tahun_ajaran;
    }

    public void setTahun_ajaran(String tahun_ajaran) {
        this.tahun_ajaran = tahun_ajaran;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }
}
