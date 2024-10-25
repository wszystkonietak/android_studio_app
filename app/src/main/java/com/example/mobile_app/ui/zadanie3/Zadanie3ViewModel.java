package com.example.mobile_app.ui.zadanie3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Zadanie3ViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public Zadanie3ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("zadanie3");
    }

    public LiveData<String> getText() {
        return mText;
    }
}