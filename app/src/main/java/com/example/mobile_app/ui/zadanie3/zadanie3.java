package com.example.mobile_app.ui.zadanie3;

import androidx.lifecycle.ViewModelProvider;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Zadanie3ViewModel zadanie3ViewModel =
                new ViewModelProvider(this).get(Zadanie3ViewModel.class);

        binding = com.example.mobile_app.databinding.FragmentZadanie3Binding.inflate(inflater, container, false);
        View root = binding.getRoot();
        ListView list = binding.listView;
        EditText text = binding.editText;
        Button button = binding.button;
        ArrayList<String> myStringArray1 = new ArrayList<String>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, myStringArray1);
        list.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View view) {
            myStringArray1.add(text.getText().toString());
            adapter.notifyDataSetChanged();
        }
        });

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                myStringArray1.remove(position);
                adapter.notifyDataSetChanged();
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