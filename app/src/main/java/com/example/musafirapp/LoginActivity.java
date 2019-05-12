package com.example.musafirapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;


import com.example.musafirapp.api.RestApiInterface;
import com.example.musafirapp.api.RestServiceHelper;
import com.example.musafirapp.models.BaseModel;
import com.example.musafirapp.models.UserModel;
import com.example.musafirapp.util.UserSession;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.email)
    EditText etEmail;

    @BindView(R.id.password)
    EditText etPassword;

    @BindView(R.id.btn_login)
    Button btnLogin;

    UserSession userSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userSession = new UserSession(getApplicationContext());
        ButterKnife.bind(this);
        userSession.checkLogin();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String txt_email = etEmail.getText().toString();
                final String txt_password = etPassword.getText().toString();

                RestApiInterface restApiInterface = RestServiceHelper.getClient().create(RestApiInterface.class);

                Call<BaseModel> getUserData = restApiInterface.postLogin(txt_email, txt_password);
                getUserData.enqueue(new Callback<BaseModel>() {
                    @Override
                    public void onResponse(Call<BaseModel> call, Response<BaseModel> response) {
                        if (response.body() != null) {
                            UserModel userModel = response.body().getData();
                            Toast.makeText(LoginActivity.this, "test berhasil " + userModel.getUser_id(), Toast.LENGTH_SHORT).show();

                            userSession.createSession(userModel.getUser_id());
                            Intent i = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(i);
                            finish();
                        } else {
                            Toast.makeText(LoginActivity.this, "Username / password salah ", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<BaseModel> call, Throwable t) {
                        Toast.makeText(LoginActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });
    }

}
