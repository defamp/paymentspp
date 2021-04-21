package com.example.paymentspp.Model.Dashboard;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetDashboard {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    String result;
    List<Dashboard> listDataDashboard;
    @SerializedName("message")
    String message;

    public String getStatus() {
        return status;
    }

    public String getResult() {
        return result;
    }

    public List<Dashboard> getListDataDashboard() {
        return listDataDashboard;
    }

    public void setListDataDashboard(List<Dashboard> listDataDashboard) {
        this.listDataDashboard = listDataDashboard;
    }

    public String getMessage() {
        return message;
    }
}
