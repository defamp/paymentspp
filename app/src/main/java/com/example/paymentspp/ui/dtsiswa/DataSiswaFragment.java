package com.example.paymentspp.ui.dtsiswa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.paymentspp.R;

public class DataSiswaFragment extends Fragment {

    private DataSiswaViewModel datasiswaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        datasiswaViewModel =
                new ViewModelProvider(this).get(DataSiswaViewModel.class);
        View root = inflater.inflate(R.layout.data_siswa, container, false);
        final TextView textView = root.findViewById(R.id.text_siswa);
        datasiswaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
