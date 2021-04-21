package com.example.paymentspp.Model.Siswa;

import com.google.gson.annotations.SerializedName;

public class PostPatchDelSiswa {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    String result;
    @SerializedName("message")
    String message;
    Siswa mSiswa;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Siswa getSiswa() {
        return mSiswa;
    }

    public void setSiswa(Siswa mSiswa) {
        this.mSiswa = mSiswa;
    }
}
