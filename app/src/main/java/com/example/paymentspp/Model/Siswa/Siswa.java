package com.example.paymentspp.Model.Siswa;

import com.google.gson.annotations.SerializedName;

public class Siswa {
    @SerializedName("nis")
    private String nis;
    @SerializedName("nisn")
    private String nisn;
    @SerializedName("nama_siswa")
    private String nama_siswa;
    @SerializedName("id_kelas")
    private int id_kelas;
    @SerializedName("alamat")
    private String alamat;
    @SerializedName("no_tlp")
    private String no_tlp;

    public Siswa(){

    }
    public Siswa(String nis, String nisn, String nama_siswa, int id_kelas, String alamat, String no_tlp){
        this.nis = nis;
        this.nisn = nisn;
        this.nama_siswa = nama_siswa;
        this.id_kelas = id_kelas;
        this.alamat = alamat;
        this.no_tlp = no_tlp;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getNisn() {
        return nisn;
    }

    public void setNisn(String nisn) {
        this.nisn = nisn;
    }

    public String getNama_siswa() {
        return nama_siswa;
    }

    public void setNama_siswa(String nama_siswa) {
        this.nama_siswa = nama_siswa;
    }

    public int getId_kelas() {
        return id_kelas;
    }

    public void setId_kelas(int id_kelas) {
        this.id_kelas = id_kelas;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_tlp() {
        return no_tlp;
    }

    public void setNo_tlp(String no_tlp) {
        this.no_tlp = no_tlp;
    }
}
