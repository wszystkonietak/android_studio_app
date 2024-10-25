package com.example.mobile_app.ui.zadanie5;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Zadanie5ViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public Zadanie5ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("zadanie5");
    }

    public LiveData<String> getText() {
        return mText;
    }
}