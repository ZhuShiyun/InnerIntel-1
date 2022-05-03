package au.edu.anu.cecs.innerintel.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.annotation.Nullable;

import au.edu.anu.cecs.innerintel.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Homepage_fooditems_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Homepage_fooditems_fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container,
                             @NonNull Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_homepage_fooditems_fragment, container, false);
    }
}