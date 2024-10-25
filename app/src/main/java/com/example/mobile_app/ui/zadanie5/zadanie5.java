package com.example.mobile_app.ui.zadanie5;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class zadanie5 extends Fragment {

    private com.example.mobile_app.databinding.FragmentZadanie1Binding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Zadanie5ViewModel zadanie5ViewModel =
                new ViewModelProvider(this).get(Zadanie5ViewModel.class);

        binding = com.example.mobile_app.databinding.FragmentZadanie1Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.text;
        zadanie5ViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}