package com.example.test4.ui.infoSenadores;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SenadoresViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SenadoresViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}