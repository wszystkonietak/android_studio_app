package com.example.mobile_app.ui.zadanie6;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Zadanie6ViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public Zadanie6ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("zadanie6");
    }

    public LiveData<String> getText() {
        return mText;
    }
}