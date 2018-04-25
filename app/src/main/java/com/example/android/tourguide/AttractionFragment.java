package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionFragment extends Fragment {


    public AttractionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.image_grid, container, false);

        final ArrayList<ImageAtt> images = new ArrayList<ImageAtt>();
        images.add(new ImageAtt(R.string.hello, R.string.مرحبا, R.drawable.citadel));
        images.add(new ImageAtt(R.string.hello, R.string.مرحبا, R.drawable.citadel));
        images.add(new ImageAtt(R.string.hello, R.string.مرحبا, R.drawable.citadel));
        images.add(new ImageAtt(R.string.hello, R.string.مرحبا, R.drawable.citadel));
        images.add(new ImageAtt(R.string.hello, R.string.مرحبا, R.drawable.citadel));
        images.add(new ImageAtt(R.string.hello, R.string.مرحبا, R.drawable.citadel));


        GridAdapter adapter = new GridAdapter(getActivity(), images, R.color.category_speak);
        GridView gridView = (GridView) rootView.findViewById(R.id.gridview);
        gridView.setAdapter(adapter);

        return rootView;
    }
}
