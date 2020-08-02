package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        ArrayList<Place> restaurants = new ArrayList<Place>();
        restaurants.add(new Place("Dilli 32", "https://goo.gl/maps/6MX7SPKtGLodxuC27",
                R.drawable.dilli_32));
        restaurants.add(new Place("Thyme", "https://goo.gl/maps/EsnSqDC8CQeMRh5T8",
                R.drawable.thyme_full_view));
        PlaceAdapter restaurants_adapter = new PlaceAdapter(this, restaurants);

        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(restaurants_adapter);
    }
}