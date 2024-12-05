package com.example.mobile_app.ui.zadanie1;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class Zadanie1ViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public Zadanie1ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("zadanie1");
    }

    public LiveData<String> getText() {
        return mText;
    }
}