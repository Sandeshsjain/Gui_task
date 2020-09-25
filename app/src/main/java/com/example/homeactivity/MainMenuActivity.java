package com.example.homeactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import uk.co.deanwild.materialshowcaseview.MaterialShowcaseView;

public class MainMenuActivity extends AppCompatActivity {
    ViewPager viewPager;
    Button orange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        orange = findViewById(R.id.butoon_orange);
        viewPager= (ViewPager)findViewById(R.id.my_view_pager);
        ViewPagesAdapter viewPagesAdapter = new ViewPagesAdapter(this);
        viewPager.setAdapter(viewPagesAdapter);
        new MaterialShowcaseView.Builder(this)
                .setTarget(orange)
                .setDismissText("GOT IT")
                .setContentText("click here for move to next page")
                .setDelay(500) // optional but starting animations immediately in onCreate can make them choppy
                .singleUse("SHOWCASE_ID_orange") // provide a unique ID used to ensure it is only shown once
                .show();
    }

    public void all_onclick(View view) {


        Intent intent = new Intent(getApplicationContext(),FreshOrangeActivity.class);
        startActivity(intent);

    }
}