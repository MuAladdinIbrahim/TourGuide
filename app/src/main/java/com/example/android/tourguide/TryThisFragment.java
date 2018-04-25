package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TryThisFragment extends Fragment {

    public TryThisFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);
            final ArrayList<ImageAtt> images = new ArrayList<ImageAtt>();

        images.add(new ImageAtt(R.string.please, R.string.mn_fadlk, R.drawable.citadel));
        images.add(new ImageAtt(R.string.speak_english, R.string.hal_englsih, R.drawable.ba));
        images.add(new ImageAtt(R.string.yes, R.string.naam, R.drawable.abo));
        images.add(new ImageAtt(R.string.speak_english, R.string.hal_englsih, R.drawable.ba));
        images.add(new ImageAtt(R.string.yes, R.string.naam, R.drawable.abo));
        images.add(new ImageAtt(R.string.speak_english, R.string.hal_englsih, R.drawable.ba));
        images.add(new ImageAtt(R.string.yes, R.string.naam, R.drawable.abo));
        images.add(new ImageAtt(R.string.speak_english, R.string.hal_englsih, R.drawable.ba));
        images.add(new ImageAtt(R.string.yes, R.string.naam, R.drawable.abo));
        images.add(new ImageAtt(R.string.speak_english, R.string.hal_englsih, R.drawable.ba));
        images.add(new ImageAtt(R.string.yes, R.string.naam, R.drawable.abo));
        images.add(new ImageAtt(R.string.speak_english, R.string.hal_englsih, R.drawable.ba));
        images.add(new ImageAtt(R.string.yes, R.string.naam, R.drawable.abo));

        TryAdapter adapter = new TryAdapter(getActivity(), images, R.color.category_speak);
            ListView listView =  rootView.findViewById(R.id.list);
            listView.setAdapter(adapter);
            return rootView;
        }
}
