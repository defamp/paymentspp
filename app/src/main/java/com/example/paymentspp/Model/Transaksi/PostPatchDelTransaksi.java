package com.example.paymentspp.Model.Transaksi;

import com.google.gson.annotations.SerializedName;

public class PostPatchDelTransaksi {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    String result;
    @SerializedName("message")
    String message;
    Transaksi mTransaksi;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Transaksi getTransaksi() {
        return mTransaksi;
    }

    public void setTransaksi(Transaksi mTransaksi) {
        this.mTransaksi = mTransaksi;
    }
}
