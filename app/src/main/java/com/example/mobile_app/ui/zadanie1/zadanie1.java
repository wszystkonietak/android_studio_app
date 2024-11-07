package com.example.mobile_app.ui.zadanie1;

import androidx.lifecycle.ViewModelProvider;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

public class zadanie1 extends Fragment {

    private com.example.mobile_app.databinding.FragmentZadanie1Binding binding;
    Button button;
    TextView text, text2;
    EditText editText;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Zadanie1ViewModel zadanie1ViewModel =
                new ViewModelProvider(this).get(Zadanie1ViewModel.class);

        binding = com.example.mobile_app.databinding.FragmentZadanie1Binding.inflate(inflater, container, false);
        View root = binding.getRoot();
        

        //final TextView textView = binding.text;
        //zadanie1ViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        LinearLayout main = new LinearLayout(container.getContext());
        main.setOrientation(LinearLayout.VERTICAL);

        LinearLayout l1 = new LinearLayout(container.getContext());
        l1.setOrientation(LinearLayout.HORIZONTAL);
        text = new TextView(container.getContext());
        text.setText("text:");
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.weight = 1.0f;
        text.setLayoutParams(params);
        editText = new EditText(container.getContext());
        editText.setLayoutParams(params);
        l1.addView(text);
        l1.addView(editText);

        button = new Button(container.getContext());
        button.setText("button");
        button.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 100));


        LinearLayout l2 = new LinearLayout(container.getContext());
        l2.setOrientation(LinearLayout.HORIZONTAL);
        CheckBox checkBox = new CheckBox(container.getContext());
        text2 = new TextView(container.getContext());
        text2.setText("text:");
        l2.addView(text2);
        l2.addView(checkBox);

        button.setOnClickListener(new View.OnClickListener() {            @Override
            public void onClick(View view) {
            String s = String.valueOf(editText.getText());
            if(s.length() == 0) {
                s = "Nie wpisano tekstu";
            }
            if(checkBox.isChecked()) {
                Toast.makeText(getActivity(), s,
                        Toast.LENGTH_LONG).show();
            } else {
                Snackbar.make(container, s, Snackbar.LENGTH_LONG)
                        .setAction("CLOSE", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                            }
                        })
                        .setActionTextColor(getResources().getColor(android.R.color.holo_red_light ))
                        .show();
            }
        }
        });

        main.addView(l1);
        main.addView(button);
        main.addView(l2);
        binding.getRoot().addView(main);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}