package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        String about_location = "Delhi, India’s capital territory, is a massive metropolitan area " +
                "in the country’s north. In Old Delhi, a neighborhood dating to the 1600s, stands " +
                "the imposing Mughal-era Red Fort, a symbol of India, and the sprawling Jama Masjid " +
                "mosque, whose courtyard accommodates 25,000 people. Nearby is Chandni Chowk, " +
                "a vibrant bazaar filled with food carts, sweets shops and spice stalls.";
        TextView tv = (TextView) findViewById(R.id.about_description);
        tv.setText(about_location);
    }
}