package com.example.paymentspp.ui.dtkelas;

import android.app.Dialog;
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
import com.google.android.material.textfield.TextInputEditText;

public class DataKelasFragment extends Fragment {

    private DataKelasViewModel datakelasViewModel;

    Dialog myDialog;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        datakelasViewModel =
                new ViewModelProvider(this).get(DataKelasViewModel.class);
        View root = inflater.inflate(R.layout.data_kelas, container, false);
        return root;
    }

    public void pilihJurusan(View view){
        Spinner spinnerPilihJurusan = (Spinner)view.findViewById(R.id.listJurusan);
        String keahlian = String.valueOf(spinnerPilihJurusan.getSelectedItem());
    }

}
