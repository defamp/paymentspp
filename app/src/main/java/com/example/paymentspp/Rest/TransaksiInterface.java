package com.example.paymentspp.Rest;

import com.example.paymentspp.Model.Transaksi.GetTransaksi;
import com.example.paymentspp.Model.Transaksi.PostPatchDelTransaksi;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.POST;

public interface TransaksiInterface {
    @GET("transaksi")
    Call<GetTransaksi> getTransaksi();
    @FormUrlEncoded
    @POST("transaksi")
    Call<PostPatchDelTransaksi>postTransaksi(
            @Field("no_struk") int no_struk,
            @Field("nip") String nip,
            @Field("nis") String nis,
            @Field("id_spp") int id_spp,
            @Field("tanggal_bayar") String tanggal_bayar,
            @Field("file") String file
    );
    @PATCH("transaksi")
    Call<PostPatchDelTransaksi>patchTransaksi(
            @Field("no_struk") int no_struk,
            @Field("nip") String nip,
            @Field("nis") String nis,
            @Field("id_spp") int id_spp,
            @Field("tanggal_bayar") String tanggal_bayar,
            @Field("file") String file
    );
    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "transaksi", hasBody = true)
    Call<PostPatchDelTransaksi>deleteTransaksi(
            @Field("no_struk") int no_struk
    );
}
