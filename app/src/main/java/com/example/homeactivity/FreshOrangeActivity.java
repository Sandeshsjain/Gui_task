package com.example.homeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import uk.co.deanwild.materialshowcaseview.MaterialShowcaseView;

public class FreshOrangeActivity extends AppCompatActivity {
    TextView checkout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresh_orange);
        checkout = findViewById(R.id.checkout);
        new MaterialShowcaseView.Builder(this)
                .setTarget(checkout)
                .setDismissText("GOT IT")
                .setContentText("click here for move to next page")
                .setDelay(500) // optional but starting animations immediately in onCreate can make them choppy
                .singleUse("SHOWCASE_ID_CHECKOUT") // provide a unique ID used to ensure it is only shown once
                .show();
    }

    public void check_out(View view) {
        Intent intent = new Intent(getApplicationContext(),MapActivity.class);
        startActivity(intent);
    }
}