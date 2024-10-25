package com.example.mobile_app.ui.zadanie8;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Zadanie8ViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public Zadanie8ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("zadanie8");
    }

    public LiveData<String> getText() {
        return mText;
    }
}