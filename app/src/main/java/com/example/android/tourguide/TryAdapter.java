package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TryAdapter extends ArrayAdapter<ImageAtt> {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    public TryAdapter(Context context, ArrayList<ImageAtt> images, int colorResourceId) {
        super(context, 0, images);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.try_list, parent, false);
        }
        ImageAtt currentWord = getItem(position);

        TextView nameTextView =  listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentWord.getNameId());
        TextView descriptionTextView = listItemView.findViewById(R.id.details_text_view);
        descriptionTextView.setText(currentWord.getDescriptionId());
        ImageView imageView =  listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
