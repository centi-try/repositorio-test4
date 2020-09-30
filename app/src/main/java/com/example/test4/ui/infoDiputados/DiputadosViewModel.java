package com.example.test4.ui.infoDiputados;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DiputadosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DiputadosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}