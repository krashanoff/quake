package org.dhsdevelopers.quake;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class KitsFragment extends Fragment{
    public static KitsFragment newInstance() {
        KitsFragment fragment = new KitsFragment();
        return fragment;
    }
    public KitsFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.kits_fragment, container, false);
        return rootView;
    }
}
