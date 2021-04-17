package com.example.paymentspp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        myDialog = new Dialog(this);

    }

    public void ShowPopup(View v){
        TextInputEditText nis = (TextInputEditText) findViewById(R.id.username);
        TextInputEditText pass = (TextInputEditText) findViewById(R.id.password);

        String ambilnis = nis.getText().toString();
        String ambilpass = pass.getText().toString();

        if (ambilnis.equals("admin") && ambilpass.equals("admin123")){
            myDialog.setContentView(R.layout.activity_popup);
        } else {
            myDialog.setContentView(R.layout.activity_popup_failed);
        }

        myDialog.show();
    }

    public void ShowNavigation(View v){
        Intent navigasi = new Intent(getApplicationContext(), NavigationActivity.class);
        startActivity(navigasi);
    }

    public void ShowNavigationFailed(View v){
        myDialog.dismiss();
    }
}