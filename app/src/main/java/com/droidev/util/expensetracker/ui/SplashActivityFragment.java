package com.droidev.util.expensetracker.ui;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.droidev.util.expensetracker.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class SplashActivityFragment extends Fragment {

    public SplashActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_splash, container, false);
    }
}
