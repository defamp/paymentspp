package com.example.paymentspp.Model.SPP;

import com.google.gson.annotations.SerializedName;

public class PostPatchDelSPP {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    String result;
    @SerializedName("message")
    String message;
    SPP mSPP;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SPP getSPP() {
        return mSPP;
    }

    public void setSPP(SPP mSPP) {
        this.mSPP = mSPP;
    }
}
