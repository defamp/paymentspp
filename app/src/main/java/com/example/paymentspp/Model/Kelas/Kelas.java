package com.example.paymentspp.Model.Kelas;

import com.google.gson.annotations.SerializedName;

public class Kelas {
    @SerializedName("id_kelas")
    private int id_kelas;
    @SerializedName("tahun_ajaran")
    private String tahun_ajaran;
    @SerializedName("jurusan")
    private String jurusan;
    @SerializedName("nama_kelas")
    private String nama_kelas;

    public Kelas(){

    }
    public Kelas(int id_kelas, String tahun_ajaran, String jurusan, String nama_kelas){
        this.id_kelas = id_kelas;
        this.tahun_ajaran = tahun_ajaran;
        this.jurusan = jurusan;
        this.nama_kelas = nama_kelas;
    }

    public int getId_kelas() {
        return id_kelas;
    }

    public void setId_kelas(int id_kelas) {
        this.id_kelas = id_kelas;
    }

    public String getTahun_ajaran() {
        return tahun_ajaran;
    }

    public void setTahun_ajaran(String tahun_ajaran) {
        this.tahun_ajaran = tahun_ajaran;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNama_kelas() {
        return nama_kelas;
    }

    public void setNama_kelas(String nama_kelas) {
        this.nama_kelas = nama_kelas;
    }
}
