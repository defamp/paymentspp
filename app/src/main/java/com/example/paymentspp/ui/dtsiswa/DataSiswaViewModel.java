package com.example.paymentspp.ui.dtsiswa;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DataSiswaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DataSiswaViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
