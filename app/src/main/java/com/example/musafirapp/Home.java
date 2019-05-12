package com.example.musafirapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.musafirapp.api.RestApiInterface;
import com.example.musafirapp.api.RestServiceHelper;
import com.example.musafirapp.models.BaseModel;
import com.example.musafirapp.models.ProfileModel;
import com.example.musafirapp.util.UserSession;

import retrofit2.Call;

public class Home extends Fragment {

    private UserSession userSession;

    public Home() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RestApiInterface restApiInterface = RestServiceHelper.getClient().create(RestApiInterface.class);

        Call<ProfileModel> getUserData = restApiInterface.getProfileDetail("12321");


    }
}
