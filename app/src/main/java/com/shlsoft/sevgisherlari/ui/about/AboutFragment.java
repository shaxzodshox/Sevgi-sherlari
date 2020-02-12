package com.shlsoft.sevgisherlari.ui.about;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.shlsoft.sevgisherlari.R;
import com.shlsoft.sevgisherlari.adapter.AboutAdapter;

public class AboutFragment extends Fragment {

    private AboutViewModel slideshowViewModel;
    private ListView listView;

    private String[] title = {"Dastur nomi", "Ishlab chiqarilgan yili", "Davlat","Versiya kodi",
    "Email","Dastur yaratuvchisi"};
    private String[] description = {"Sevgi she'rlari", "2020", "Tashkent, Uzbekistan","1.0",
    "developer.shakhzod@gmail.com","Shahzodbek Ilhomov"};
    private int[] icons = {
            R.drawable.ic_info_outline_black_24dp,
            R.drawable.year,
            R.drawable.ic_location_24dp,
            R.drawable.version,
            R.drawable.mail,
            R.drawable.developer
    };

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(AboutViewModel.class);
        View root = inflater.inflate(R.layout.fragment_about, container, false);
        listView = root.findViewById(R.id.listView);

        final AboutAdapter adapter = new AboutAdapter(getActivity(), title, description, icons);
        listView.setAdapter(adapter);
        return root;
    }
}