package com.example.paymentspp.Model.Transaksi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetTransaksi {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    String result;
    List<Transaksi> listDataTransaksi;
    @SerializedName("message")
    String message;


    public String getStatus() {
        return status;
    }

    public String getResult() {
        return result;
    }

    public List<Transaksi> getListDataTransaksi() {
        return listDataTransaksi;
    }

    public void setListDataTransaksi(List<Transaksi> listDataTransaksi) {
        this.listDataTransaksi = listDataTransaksi;
    }

    public String getMessage() {
        return message;
    }
}
