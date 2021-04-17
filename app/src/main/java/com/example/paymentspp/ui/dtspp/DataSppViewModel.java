package com.example.paymentspp.ui.dtspp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DataSppViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DataSppViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
