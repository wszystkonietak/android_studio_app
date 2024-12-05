package com.example.mobile_app.ui.zadanie3;

import static java.security.AccessController.getContext;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.mobile_app.R;

import java.util.ArrayList;

public class MyCustomAdapter extends BaseAdapter implements ListAdapter {
    private ArrayList<String> list = new ArrayList<String>();
    private Context context;

    public MyCustomAdapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int pos) {
        return list.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return pos;
        //just return 0 if your list items do not have an Id variable.
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // Check if the convertView is null, if so, create a new LinearLayout as the root view
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(LinearLayout.HORIZONTAL);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            // Create the TextView and set its text
            TextView textView = new TextView(context);
            textView.setText(list.get(position)); // Set the text from the list for the current position
            textView.setLayoutParams(new LinearLayout.LayoutParams(
                    0, ViewGroup.LayoutParams.WRAP_CONTENT, 1)); // Set weight to make it fill available space

            // Create the Button and set its text
            Button button = new Button(context);
            button.setText("dksaju");
            button.setLayoutParams(new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            // Set an OnClickListener for the button to remove the item when clicked
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Remove the item from the list
                    list.remove(position);

                    // Notify the adapter that the data has changed
                    notifyDataSetChanged();
                }
            });

            // Add the TextView and Button to the LinearLayout
            linearLayout.addView(textView);
            linearLayout.addView(button);

            // Return the final view
            convertView = linearLayout;

        // Return the prepared convertView
        return convertView;
    }


}
