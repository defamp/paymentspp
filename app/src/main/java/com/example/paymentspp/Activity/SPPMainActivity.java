package com.example.paymentspp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paymentspp.Adapter.SPPAdapter;
import com.example.paymentspp.Model.SPP.GetSPP;
import com.example.paymentspp.Model.SPP.PostPatchDelSPP;
import com.example.paymentspp.Model.SPP.SPP;
import com.example.paymentspp.R;
import com.example.paymentspp.Rest.APIClient;
import com.example.paymentspp.Rest.SPPInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SPPMainActivity extends AppCompatActivity {
    EditText etx_id_spp, etx_tahun_ajaran, etx_nominal;
    Button btnTambah, btnUpdate;
    SPPInterface mSPPInterface;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public static SPPMainActivity ma;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_spp);

        etx_id_spp = (EditText)findViewById(R.id.etx_id_spp);
        etx_tahun_ajaran = (EditText)findViewById(R.id.etx_tahun_ajaran);
        etx_nominal = (EditText)findViewById(R.id.etx_nominal);

        Intent nIntent = getIntent();
        if(nIntent!=null && nIntent.getExtras()!=null){
            etx_id_spp.setText(nIntent.getStringExtra("id_spp"));
            etx_tahun_ajaran.setText(nIntent.getStringExtra("tahun_ajaran"));
            etx_nominal.setText(nIntent.getStringExtra("nominal"));
        }

        btnTambah = (Button)findViewById(R.id.btnTambah);
        btnTambah.setOnClickListener(v -> createData());
        btnUpdate.setOnClickListener(v -> updateData());

        mRecyclerView = (RecyclerView)findViewById(R.id.spp_recyclerview);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mSPPInterface = APIClient.getClient().create(SPPInterface.class);
        ma = this;
        refresh();
    }

    public void refresh(){
        Call<GetSPP> SPPCall = mSPPInterface.getSPP();
        SPPCall.enqueue(new Callback<GetSPP>() {
            @Override
            public void onResponse(Call<GetSPP> call, Response<GetSPP> response) {
                List<SPP> SPPList = response.body().getListDataSPP();
                Log.d("Retrofit Get", "Jumlah Data Kontak : " + String.valueOf(SPPList.size()));
                mAdapter = new SPPAdapter(SPPList);
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<GetSPP> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }

    public void createData(){
        String tahun_ajaran = etx_tahun_ajaran.getText().toString();
        int nominal = Integer.parseInt(etx_nominal.getText().toString());

        Call<PostPatchDelSPP>postSPPCall = mSPPInterface.postSPP(tahun_ajaran, nominal);
        postSPPCall.enqueue(new Callback<PostPatchDelSPP>() {
            @Override
            public void onResponse(Call<PostPatchDelSPP> call, Response<PostPatchDelSPP> response) {
                SPPMainActivity.ma.refresh();
                finish();
            }

            @Override
            public void onFailure(Call<PostPatchDelSPP> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
            }
        });
    }

    public  void updateData(){
        int id_spp = Integer.parseInt(etx_id_spp.getText().toString());
        String tahun_ajaran = etx_tahun_ajaran.getText().toString();
        int nominal = Integer.parseInt(etx_nominal.getText().toString());

        Call<PostPatchDelSPP>updateSPPCall = mSPPInterface.patchSPP(id_spp, tahun_ajaran, nominal);
        updateSPPCall.enqueue(new Callback<PostPatchDelSPP>() {
            @Override
            public void onResponse(Call<PostPatchDelSPP> call, Response<PostPatchDelSPP> response) {
                SPPMainActivity.ma.refresh();
                finish();
            }

            @Override
            public void onFailure(Call<PostPatchDelSPP> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
            }
        });
    }
}
