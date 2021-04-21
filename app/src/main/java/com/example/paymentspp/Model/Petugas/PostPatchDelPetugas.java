package com.example.paymentspp.Model.Petugas;

import com.google.gson.annotations.SerializedName;

public class PostPatchDelPetugas {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    String result;
    @SerializedName("message")
    String message;
    Petugas mPetugas;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Petugas getPetugas() {
        return mPetugas;
    }

    public void setPetugas(Petugas mPetugas) {
        this.mPetugas = mPetugas;
    }
}
