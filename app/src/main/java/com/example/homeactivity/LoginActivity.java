package com.example.homeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import uk.co.deanwild.materialshowcaseview.MaterialShowcaseView;

public class LoginActivity extends AppCompatActivity {
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = findViewById(R.id.login_now);

        new MaterialShowcaseView.Builder(this)
                .setTarget(login)
                .setDismissText("GOT IT")
                .setContentText("click here for move to next page")
                .setDelay(500) // optional but starting animations immediately in onCreate can make them choppy
                .singleUse("SHOWCASE_ID_LOGIN") // provide a unique ID used to ensure it is only shown once
                .show();
    }

    public void login_now(View view) {
        Intent intent = new Intent(getApplicationContext(),MainMenuActivity.class);
        startActivity(intent);
    }
}