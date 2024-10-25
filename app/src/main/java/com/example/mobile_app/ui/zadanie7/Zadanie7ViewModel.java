package com.example.mobile_app.ui.zadanie7;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Zadanie7ViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public Zadanie7ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("zadanie7");
    }

    public LiveData<String> getText() {
        return mText;
    }
}