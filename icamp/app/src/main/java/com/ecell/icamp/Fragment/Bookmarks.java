package com.ecell.icamp.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ecell.icamp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Bookmarks extends Fragment {


    public Bookmarks() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all_companies, container, false);
        return view;
    }

    public static Bookmarks newInstance() {
        Bookmarks fragment = new Bookmarks();
        return fragment;
    }

}
