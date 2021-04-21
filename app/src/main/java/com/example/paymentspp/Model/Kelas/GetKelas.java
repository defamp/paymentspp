package com.example.paymentspp.Model.Kelas;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetKelas {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    String result;
    List<Kelas> listDataKelas;
    @SerializedName("message")
    String message;

    public String getStatus() {
        return status;
    }

    public String getResult() {
        return result;
    }

    public List<Kelas> getListDataKelas() {
        return listDataKelas;
    }

    public void setListDataKelas(List<Kelas> listDataKelas) {
        this.listDataKelas = listDataKelas;
    }

    public String getMessage() {
        return message;
    }
}
