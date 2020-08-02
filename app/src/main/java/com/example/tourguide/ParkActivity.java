package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ParkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        ArrayList<Place> parks = new ArrayList<Place>();
        parks.add(new Place("Lodhi Gardens", "https://goo.gl/maps/bfnEv6ezkKjc5REi9",
                R.drawable.lodhi_garden));
        parks.add(new Place("Central Park Rajiv Chowk", "https://goo.gl/maps/SXCDCEhwehfxErgr5",
                R.drawable.central_park));
        PlaceAdapter park_adapter = new PlaceAdapter(this, parks);

        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(park_adapter);
    }
}