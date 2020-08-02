package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Humayun's Tomb", "https://goo.gl/maps/PR957ak4nRT4g5QD9",
                R.drawable.humayun_tomb));
        places.add(new Place("Hauz Khas Village", "https://goo.gl/maps/bP3v9X63QPpfFf3r6",
                R.drawable.hauz_khas_village));
        PlaceAdapter places_adapter = new PlaceAdapter(this, places);

        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(places_adapter);

    }
}