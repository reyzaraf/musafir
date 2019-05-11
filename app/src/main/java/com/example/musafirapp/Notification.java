package com.example.musafirapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.app.ActionBar;
import android.widget.Toolbar;


public class Notification extends Fragment {


    public Notification() {
        // Required empty public constructor
    }

/*    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        ActionBar actionBar = ((AppCompatActivity)getActivity()).getSupportActionBar();
    }
*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
View v = inflater.inflate(R.layout.fragment_notification, container, false);
        Toolbar toolbar = (Toolbar) v.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        return v;
    }

}
