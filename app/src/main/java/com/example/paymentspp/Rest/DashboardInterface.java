package com.example.paymentspp.Rest;

import com.example.paymentspp.Model.Dashboard.GetDashboard;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;

public interface DashboardInterface {
    @GET("dashboard")
    Call<GetDashboard> getDashboard();
}
