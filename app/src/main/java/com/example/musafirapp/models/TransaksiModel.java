package com.example.musafirapp.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TransaksiModel {

    @SerializedName("status")
    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
