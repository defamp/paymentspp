package com.example.paymentspp.ui.dttransaksi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DataTransaksiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DataTransaksiViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
