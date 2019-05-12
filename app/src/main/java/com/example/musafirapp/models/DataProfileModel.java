package com.example.musafirapp.models;

import com.google.gson.annotations.SerializedName;

public class DataProfileModel {

    @SerializedName("user_id")
    String user_id;

    @SerializedName("nama")
    String nama;

    @SerializedName("saldo")
    String saldo;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public DataProfileModel(String user_id, String nama, String saldo) {
        this.user_id = user_id;
        this.nama = nama;
        this.saldo = saldo;
    }


    public DataProfileModel(String user_id) {
        this.user_id = user_id;

    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

}
