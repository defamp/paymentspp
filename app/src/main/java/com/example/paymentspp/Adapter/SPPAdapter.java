package com.example.paymentspp.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.paymentspp.Activity.SPPMainActivity;
import com.example.paymentspp.Model.SPP.SPP;
import com.example.paymentspp.R;

import java.util.List;

public class SPPAdapter extends RecyclerView.Adapter<SPPAdapter.MyViewHolder> {
    List<SPP>mSPPList;

    public SPPAdapter(List<SPP>SPPList){
        mSPPList = SPPList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_spp, parent, false);
        MyViewHolder mViewHolder = new MyViewHolder(mView);

        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position){
        holder.mTextViewIdSPP.setText(mSPPList.get(position).getId_spp());
        holder.mTextViewTahunAjaran.setText(mSPPList.get(position).getTahun_ajaran());
        holder.mTextViewNominal.setText(mSPPList.get(position).getNominal());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nIntent = new Intent(v.getContext(), SPPMainActivity.class);
                nIntent.putExtra("id_spp", mSPPList.get(position).getId_spp());
                nIntent.putExtra("tahun_ajaran", mSPPList.get(position).getTahun_ajaran());
                nIntent.putExtra("nominal", mSPPList.get(position).getNominal());
                v.getContext().startActivity(nIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mSPPList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextViewIdSPP, mTextViewTahunAjaran, mTextViewNominal;

        public MyViewHolder(View itemView){
            super(itemView);
            mTextViewIdSPP = (TextView)itemView.findViewById(R.id.txt_id_spp);
            mTextViewTahunAjaran = (TextView)itemView.findViewById(R.id.txt_tahun_ajaran);
            mTextViewNominal = (TextView)itemView.findViewById(R.id.txt_nominal);
        }
    }
}
