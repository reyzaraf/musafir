package com.example.musafirapp.models;

import com.google.gson.annotations.SerializedName;

public class UserModel {

    @SerializedName("user_id")
    String user_id;

    public UserModel(String user_id) {
        this.user_id = user_id;

    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
