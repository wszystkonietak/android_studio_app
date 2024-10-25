package com.example.mobile_app.ui.zadanie9;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Zadanie9ViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public Zadanie9ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("zadanie9");
    }

    public LiveData<String> getText() {
        return mText;
    }
}