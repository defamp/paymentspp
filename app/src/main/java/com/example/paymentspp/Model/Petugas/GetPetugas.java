package com.example.paymentspp.Model.Petugas;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetPetugas {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    String result;
    List<Petugas> listDataPetugas;
    @SerializedName("message")
    String message;


    public String getStatus() {
        return status;
    }

    public String getResult() {
        return result;
    }

    public List<Petugas> getListDataPetugas() {
        return listDataPetugas;
    }

    public void setListDataPetugas(List<Petugas> listDataPetugas) {
        this.listDataPetugas = listDataPetugas;
    }

    public String getMessage() {
        return message;
    }
}
