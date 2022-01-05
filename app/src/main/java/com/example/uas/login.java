package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    String username="wisata";
    String Password="wisata";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText txtUser=findViewById(R.id.txtUser);
        EditText txtPass=findViewById(R.id.txtPass);
        Button Login=findViewById(R.id.login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtUser.getText().toString().equalsIgnoreCase(username)&&txtPass.getText().toString().equalsIgnoreCase(Password)){
                    startActivity(new Intent(login.this,Menu.class));
                }else{
                    Toast.makeText(login.this,"Username atau Password Salah",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}