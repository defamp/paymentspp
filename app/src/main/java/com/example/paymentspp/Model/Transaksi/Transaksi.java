package com.example.paymentspp.Model.Transaksi;

import com.google.gson.annotations.SerializedName;

public class Transaksi {
    @SerializedName("no_struk")
    private int no_struk;
    @SerializedName("nip")
    private String nip;
    @SerializedName("nis")
    private String nis;
    @SerializedName("id_spp")
    private int id_spp;
    @SerializedName("tanggal_bayar")
    private String tanggal_bayar;
    @SerializedName("file")
    private String file;

    public Transaksi(){

    }
    public Transaksi(int no_struk, String nip, String nis, int id_spp, String tanggal_bayar, String file){
        this.no_struk = no_struk;
        this.nip = nip;
        this.nis = nis;
        this.id_spp = id_spp;
        this.tanggal_bayar = tanggal_bayar;
        this.file = file;
    }

    public int getNo_struk() {
        return no_struk;
    }

    public void setNo_struk(int no_struk) {
        this.no_struk = no_struk;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
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

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
