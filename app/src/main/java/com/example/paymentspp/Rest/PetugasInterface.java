package com.example.paymentspp.Rest;

import com.example.paymentspp.Model.Petugas.GetPetugas;
import com.example.paymentspp.Model.Petugas.PostPatchDelPetugas;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.POST;

public interface PetugasInterface {
    @GET("petugas")
    Call<GetPetugas> getPetugas();
    @FormUrlEncoded
    @POST("petugas")
    Call<PostPatchDelPetugas>postPetugas(
            @Field("nip") String nip,
            @Field("nama_petugas") String nama_petugas,
            @Field("password") String password,
            @Field("role") String role
    );
    @PATCH("petugas")
    Call<PostPatchDelPetugas>patchPetugas(
            @Field("nip") String nip,
            @Field("nama_petugas") String nama_petugas,
            @Field("password") String password,
            @Field("role") String role
    );
    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "petugas", hasBody = true)
    Call<PostPatchDelPetugas>deletePetugas(
            @Field("nip") String nip
    );
}
