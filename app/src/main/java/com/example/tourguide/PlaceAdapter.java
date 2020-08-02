package com.example.tourguide;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(@NonNull Context context, @NonNull List<Place> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView =convertView;
        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_list, parent, false
            );
        }

        // Get the {@link Place} object located at this position
        Place place = getItem(position);

        // Get image view
        ImageView placeImageView = (ImageView) listItemView.findViewById(R.id.image);
        // setting up image resource on the placeholder
        Log.v(String.valueOf(getContext().getClass()), "Image Resource Id : "+ place.getImageResourceId());
        placeImageView.setImageResource(place.getImageResourceId());

        // Get Text View
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.name);
        // setting up name in the placeholder
        placeTextView.setText(place.getName());
        return listItemView;
    }
}
