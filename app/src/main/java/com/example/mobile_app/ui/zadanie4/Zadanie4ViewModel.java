package com.example.mobile_app.ui.zadanie4;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Zadanie4ViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public Zadanie4ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("zadanie4");
    }

    public LiveData<String> getText() {
        return mText;
    }
}