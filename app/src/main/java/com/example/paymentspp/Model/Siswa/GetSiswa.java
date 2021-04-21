package com.example.paymentspp.Model.Siswa;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetSiswa {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    String result;
    List<Siswa> listDataSiswa;
    @SerializedName("message")
    String message;

    public String getStatus() {
        return status;
    }

    public String getResult() {
        return result;
    }

    public List<Siswa> getListDataSiswa() {
        return listDataSiswa;
    }

    public void setListDataSiswa(List<Siswa> listDataSiswa) {
        this.listDataSiswa = listDataSiswa;
    }

    public String getMessage() {
        return message;
    }
}
