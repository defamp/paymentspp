package com.example.paymentspp.ui.dtkelas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DataKelasViewModel extends ViewModel{

    private MutableLiveData<String> mText;

    public DataKelasViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
