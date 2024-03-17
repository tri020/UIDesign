package com.example.btapandroi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText user;
    private EditText edtPass;
    private Button buttonl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        initGui();
    }
    private void initGui() {
        user = findViewById(R.id.user);
        edtPass = findViewById(R.id.pass);
        buttonl = findViewById(R.id.buttonl);

        buttonl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String email = user.getText().toString();
                String password = edtPass.getText().toString();
                if (email.equals("admin") && password.equals("123")){
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(LoginActivity.this,"Wrong username or passowrd", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

}