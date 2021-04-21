package com.example.paymentspp.Rest;

import com.example.paymentspp.Model.Siswa.GetSiswa;
import com.example.paymentspp.Model.Siswa.PostPatchDelSiswa;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.POST;

public interface SiswaInterface {
    @GET("siswa")
    Call<GetSiswa> getSiswa();
    @FormUrlEncoded
    @POST("siswa")
    Call<PostPatchDelSiswa>postSiswa(
            @Field("nis") String nis,
            @Field("nisn") String nisn,
            @Field("nama_siswa") String nama_siswa,
            @Field("id_kelas") int id_kelas,
            @Field("alamat") String alamat,
            @Field("no_tlp") String no_tlp
    );
    @PATCH("siswa")
    Call<PostPatchDelSiswa>patchSiswa(
            @Field("nis") String nis,
            @Field("nisn") String nisn,
            @Field("nama_siswa") String nama_siswa,
            @Field("id_kelas") int id_kelas,
            @Field("alamat") String alamat,
            @Field("no_tlp") String no_tlp
    );
    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "siswa", hasBody = true)
    Call<PostPatchDelSiswa>deleteSiswa(
            @Field("nis") String nis
    );
}
