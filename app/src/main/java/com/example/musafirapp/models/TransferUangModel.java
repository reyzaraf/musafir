package com.example.musafirapp.models;

import com.google.gson.annotations.SerializedName;

public class TransferUangModel {

    @SerializedName("nominal")
    String nominal;

    @SerializedName("bank_id")
    String bank_id;

    @SerializedName("to_no_rekening")
    String to_no_rekening;

    @SerializedName("description")
    String description;

    @SerializedName("pin")
    String pin;

    @SerializedName("date")
    String date;

    @SerializedName("user_id")
    String user_id;

    public TransferUangModel(String nominal, String bank_id, String to_no_rekening, String description, String pin, String date, String user_id) {
        this.nominal = nominal;
        this.bank_id = bank_id;
        this.to_no_rekening = to_no_rekening;
        this.description = description;
        this.pin = pin;
        this.date = date;
        this.user_id = user_id;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public String getBank_id() {
        return bank_id;
    }

    public void setBank_id(String bank_id) {
        this.bank_id = bank_id;
    }

    public String getTo_no_rekening() {
        return to_no_rekening;
    }

    public void setTo_no_rekening(String to_no_rekening) {
        this.to_no_rekening = to_no_rekening;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}

