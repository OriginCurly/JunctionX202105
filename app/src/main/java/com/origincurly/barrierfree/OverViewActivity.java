package com.origincurly.barrierfree;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class OverViewActivity extends BasicActivity  implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
        setActivity(this, this);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapView);
        mapFragment.getMapAsync(this);
        initTTS();
    }

    public void BackClicked(View v) {
        finishActivity(R.anim.animation_stop_short, R.anim.animation_fade_out);
    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {
        mMap = googleMap;

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        oneMarker();
    }

    public void oneMarker() {
        LatLng seoul = new LatLng(37.49883620509053, 127.0281089976353);

        MarkerOptions makerOptions = new MarkerOptions();
        makerOptions
                .position(seoul)
//                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
                .alpha(0.5f);

        mMap.addMarker(makerOptions);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(seoul, 16));
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            BackClicked(null);
        }

        return true;
    }
}