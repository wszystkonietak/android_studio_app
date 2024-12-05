package com.example.mobile_app.ui.zadanie3;

import static com.example.mobile_app.databinding.FragmentSlideshowBinding.inflate;

import static java.security.AccessController.getContext;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mobile_app.R;

import java.util.ArrayList;

public class zadanie3 extends Fragment {

    private com.example.mobile_app.databinding.FragmentZadanie3Binding binding;
    public Zadanie3ViewModel mViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Zadanie3ViewModel zadanie3ViewModel =
                new ViewModelProvider(this).get(Zadanie3ViewModel.class);

        binding = com.example.mobile_app.databinding.FragmentZadanie3Binding.inflate(inflater, container, false);
        View root = binding.getRoot();
        ListView list = binding.listView;
        EditText text = binding.editText;
        Button button = binding.button;
        mViewModel = new ViewModelProvider(requireActivity()).get(Zadanie3ViewModel.class);

        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(mViewModel.myStringArray1, getContext());
        list.setAdapter(myCustomAdapter);
        button.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View view) {
            mViewModel.myStringArray1.add(text.getText().toString());

            myCustomAdapter.notifyDataSetChanged();
            text.setText("");
        }
        });

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                mViewModel.myStringArray1.remove(position);
                myCustomAdapter.notifyDataSetChanged();
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}