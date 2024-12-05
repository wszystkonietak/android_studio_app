package com.example.mobile_app.ui.zadanie3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class Zadanie3ViewModel extends ViewModel {
    private final MutableLiveData<String> mText;
    public ArrayList<String> myStringArray1;

    public Zadanie3ViewModel() {
        mText = new MutableLiveData<>();
        myStringArray1 = new ArrayList<>();
        mText.setValue("zadanie3");
    }


    public LiveData<String> getText() {
        return mText;
    }
}