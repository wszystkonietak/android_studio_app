package com.example.mobile_app.ui.zadanie2;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Zadanie2ViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public Zadanie2ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("zadanie2");
    }

    public LiveData<String> getText() {
        return mText;
    }
}