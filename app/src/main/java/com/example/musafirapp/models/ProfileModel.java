package com.example.musafirapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProfileModel {

    @SerializedName("msg")
    @Expose
    String msg;

    @SerializedName("data")
    DataProfileModel data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataProfileModel getData() {
        return data;
    }

    public void setData(DataProfileModel data) {
        this.data = data;
    }
}
