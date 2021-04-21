package com.example.paymentspp.Rest;

import com.example.paymentspp.Model.Kelas.GetKelas;
import com.example.paymentspp.Model.Kelas.PostPatchDelKelas;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.POST;

public interface KelasInterface {
    @GET("kelas")
    Call<GetKelas> getKelas();
    @FormUrlEncoded
    @POST("kelas")
    Call<PostPatchDelKelas>postKelas(
            @Field("id_kelas") int id_kelas,
            @Field("tahun_ajaran") String tahun_ajaran,
            @Field("jurusan") String jurusan,
            @Field("nama_kelas") String nama_kelas
    );
    @PATCH("kelas")
    Call<PostPatchDelKelas>patchKelas(
            @Field("id_kelas") int id_kelas,
            @Field("tahun_ajaran") String tahun_ajaran,
            @Field("jurusan") String jurusan,
            @Field("nama_kelas") String nama_kelas
    );
    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "kelas", hasBody = true)
    Call<PostPatchDelKelas>deleteKelas(
            @Field("id_kelas") int id_kelas
    );
}
