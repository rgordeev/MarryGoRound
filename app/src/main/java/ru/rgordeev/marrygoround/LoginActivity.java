package ru.rgordeev.marrygoround;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText login;
    private EditText password;

    private static final String PASSWORD    = "secret";
    private static final String LOGIN       = "ivan";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.login);
        password = findViewById(R.id.password);

    }

    public void onClick(View view) {
        String l = login.getText().toString();
        String p = password.getText().toString();

        if (PASSWORD.equals(p) && LOGIN.equals(l)) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            getApplicationContext().startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "WRONG LOGIN/PASSWORD", LENGTH_SHORT).show();
        }
    }
}