package com.example.paymentspp.ui.dtsiswa;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.DialogFragmentNavigator;

import com.example.paymentspp.NavigationActivity;
import com.example.paymentspp.R;

public class DataSiswaFragment extends Fragment {

    private DataSiswaViewModel datasiswaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        datasiswaViewModel =
                new ViewModelProvider(this).get(DataSiswaViewModel.class);
        View root = inflater.inflate(R.layout.data_siswa, container, false);

        return root;
    }
}
