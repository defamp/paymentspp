package com.example.paymentspp.Model.Kelas;

import com.google.gson.annotations.SerializedName;

public class PostPatchDelKelas {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    String result;
    @SerializedName("message")
    String message;
    Kelas mKelas;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Kelas getKelas() {
        return mKelas;
    }

    public void setKelas(Kelas mKelas) {
        this.mKelas = mKelas;
    }
}
