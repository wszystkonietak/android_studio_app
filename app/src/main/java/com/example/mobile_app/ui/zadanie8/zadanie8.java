package com.example.mobile_app.ui.zadanie8;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class zadanie8 extends Fragment {

    private com.example.mobile_app.databinding.FragmentZadanie8Binding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Zadanie8ViewModel zadanie8ViewModel =
                new ViewModelProvider(this).get(Zadanie8ViewModel.class);

        binding = com.example.mobile_app.databinding.FragmentZadanie8Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.text;
        zadanie8ViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}