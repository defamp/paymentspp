package com.example.paymentspp.ui.dtpetugas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.paymentspp.R;

public class DataPetugasFragment extends Fragment {

    private DataPetugasViewModel datapetugasViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        datapetugasViewModel =
                new ViewModelProvider(this).get(DataPetugasViewModel.class);
        View root = inflater.inflate(R.layout.data_petugas, container, false);

        return root;
    }

    public void pilihRole(View view){
        Spinner spinnerPilihRole = (Spinner)view.findViewById(R.id.listRole);
        String wewenang = String.valueOf(spinnerPilihRole.getSelectedItem());
    }
}
