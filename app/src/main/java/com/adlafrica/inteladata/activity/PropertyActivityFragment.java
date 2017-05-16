package com.adlafrica.inteladata.activity;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adlafrica.inteladata.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class PropertyActivityFragment extends Fragment {

    public PropertyActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_property, container, false);
    }
}
