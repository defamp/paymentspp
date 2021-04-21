package com.example.paymentspp.Rest;

import com.example.paymentspp.Model.SPP.GetSPP;
import com.example.paymentspp.Model.SPP.PostPatchDelSPP;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.POST;

public interface SPPInterface {
    @GET("api/spp")
    Call<GetSPP>getSPP();
    @FormUrlEncoded
    @POST("api/spp/create")
    Call<PostPatchDelSPP>postSPP(
            @Field("tahun_ajaran") String tahun_ajaran,
            @Field("nominal") int nominal
    );
    @PATCH("api/spp/edit/{id_spp}")
    Call<PostPatchDelSPP>patchSPP(
            @Field("id_spp") int id_spp,
            @Field("tahun_ajaran") String tahun_ajaran,
            @Field("nominal") int nominal
    );
    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "api/spp/delete/{id_spp}", hasBody = true)
    Call<PostPatchDelSPP>deleteSPP(
            @Field("id_spp") int id_spp
    );
}
