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
public class CafeFragment extends Fragment {

    public CafeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<cafe> cafes = new ArrayList<cafe>();
        cafes.add(new cafe(R.string.please, R.string.mn_fadlk, R.drawable.citadel));
        cafes.add(new cafe(R.string.speak_english, R.string.hal_englsih, R.drawable.ba));
        cafes.add(new cafe(R.string.yes, R.string.naam, R.drawable.abo));
        cafes.add(new cafe(R.string.please, R.string.mn_fadlk, R.drawable.citadel));
        cafes.add(new cafe(R.string.speak_english, R.string.hal_englsih, R.drawable.ba));
        cafes.add(new cafe(R.string.yes, R.string.naam, R.drawable.abo));
        cafes.add(new cafe(R.string.please, R.string.mn_fadlk, R.drawable.citadel));
        cafes.add(new cafe(R.string.speak_english, R.string.hal_englsih, R.drawable.ba));
        cafes.add(new cafe(R.string.yes, R.string.naam, R.drawable.abo));
        cafes.add(new cafe(R.string.please, R.string.mn_fadlk, R.drawable.citadel));
        cafes.add(new cafe(R.string.speak_english, R.string.hal_englsih, R.drawable.ba));
        cafes.add(new cafe(R.string.yes, R.string.naam, R.drawable.abo));
        cafes.add(new cafe(R.string.please, R.string.mn_fadlk, R.drawable.citadel));
        cafes.add(new cafe(R.string.speak_english, R.string.hal_englsih, R.drawable.ba));
        cafes.add(new cafe(R.string.yes, R.string.naam, R.drawable.abo));

        cafeAdapter adapter = new cafeAdapter(getActivity(), cafes, R.color.category_speak);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}



