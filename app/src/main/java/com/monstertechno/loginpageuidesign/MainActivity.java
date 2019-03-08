package com.monstertechno.loginpageuidesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username, email, password, passwordCheck;
    private TextView loginButton;
    private Button signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username_box);
        email = findViewById(R.id.email_box);
        password = findViewById(R.id.password_box);
        passwordCheck = findViewById(R.id.check_password_box);

        loginButton = findViewById(R.id.login_button);
        signupButton = findViewById(R.id.complete_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click on login button", Toast.LENGTH_SHORT).show();
            }
        });

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameText = username.getText().toString();
                String emailText = email.getText().toString();
                String passwordText = password.getText().toString();
                String passwordCheckText = passwordCheck.getText().toString();

                if (!TextUtils.isEmpty(usernameText) && !TextUtils.isEmpty(emailText)) {

                    if (password.equals(passwordCheck)) {
                        Toast.makeText(MainActivity.this, "Your registration is successful", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Password is not match", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Please add this data its needed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
