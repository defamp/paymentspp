package com.example.paymentspp.ui.home;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.paymentspp.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        String siswa[] = {"Alvito","Defa","Fauzi Ladzuardhi Rokhmana","M.Algo","Sri Nuraeni","Syarif Saurma Gultom"};
        String bayar[] = {"Membayar SPP XII RPL 1 Senilai RP. 300.000","Membayar SPP XII RPL 1 Senilai RP. 200.000",
                "Membayar SPP XII RPL 1 Senilai RP. 400.000","Membayar SPP XII RPL 1 Senilai RP. 350.000",
                "Membayar SPP XII RPL 1 Senilai RP. 600.000",""};

        ListView listView = (ListView) view.findViewById(R.id.list);

        ListAdapter adapter = new ListAdapter(getActivity(), createPersons());

        listView.setAdapter(adapter);

        return view;

    }

    private List<Person> createPersons(){
        List<Person>data=new ArrayList<>();
        data.add(new Person(R.drawable.ic_baseline_person_24,"Alvito","Membayar SPP XII RPL 1 Senilai RP. 300.000"));
        data.add(new Person(R.drawable.ic_baseline_person_24,"Defa","Membayar SPP XII RPL 1 Senilai RP. 200.000"));
        data.add(new Person(R.drawable.ic_baseline_person_24,"Fauzi Ladzuardhi Rokhmana","Membayar SPP XII RPL 1 Senilai RP. 400.000"));
        data.add(new Person(R.drawable.ic_baseline_person_24,"M.Algo","Membayar SPP XII RPL 1 Senilai RP. 350.000"));
        data.add(new Person(R.drawable.ic_baseline_person_24,"Sri Nuraeni","Membayar SPP XII RPL 1 Senilai RP. 600.000"));
        data.add(new Person(R.drawable.ic_baseline_person_24,"Syarif Saurma Gultom",""));


        return data;
    }
}
