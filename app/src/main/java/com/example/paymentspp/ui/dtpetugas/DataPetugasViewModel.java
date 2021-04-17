package com.example.paymentspp.ui.dtpetugas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DataPetugasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DataPetugasViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
