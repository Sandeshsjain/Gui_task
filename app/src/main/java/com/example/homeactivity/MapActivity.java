package com.example.homeactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import uk.co.deanwild.materialshowcaseview.MaterialShowcaseView;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Button shop_now;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapView);
        mapFragment.getMapAsync(this);
        shop_now = findViewById(R.id.buttonshopnow);
        new MaterialShowcaseView.Builder(this)
                .setTarget(shop_now)
                .setDismissText("GOT IT")
                .setContentText("click here for move to next page")
                .setDelay(500) // optional but starting animations immediately in onCreate can make them choppy
                .singleUse("SHOWCASE_ID_shopnow") // provide a unique ID used to ensure it is only shown once
                .show();

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(27.2048, 77.4975);
        LatLng karond = new LatLng(23.2951,77.4037);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Fruit Shop"));
        mMap.addMarker(new MarkerOptions().position(karond).title("Fruit Shop"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    public void ShopNow(View view) {
        Intent intent = new Intent(getApplicationContext(),BillActivity.class);
        startActivity(intent);
    }
}