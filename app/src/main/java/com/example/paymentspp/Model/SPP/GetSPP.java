package com.example.paymentspp.Model.SPP;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetSPP {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    String result;
    List<SPP> listDataSPP;
    @SerializedName("message")
    String message;


    public String getStatus() {
        return status;
    }

    public String getResult() {
        return result;
    }

    public List<SPP> getListDataSPP() {
        return listDataSPP;
    }

    public void setListDataSPP(List<SPP> listDataSPP) {
        this.listDataSPP = listDataSPP;
    }

    public String getMessage() {
        return message;
    }
}
