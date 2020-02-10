package com.android.sevgisherlari.ui.others;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.android.sevgisherlari.R;

public class OthersFragment extends Fragment implements View.OnClickListener{


    private TextView sevgi_testi,ummon,benom,prank,ussd,tarjimon,weather;
    View root;

    private OthersViewModel toolsViewModel;

    String packageApp = "";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        toolsViewModel =
                ViewModelProviders.of(this).get(OthersViewModel.class);
        root = inflater.inflate(R.layout.fragment_other_apps, container, false);

        initViews();
        initListeners();

        return root;
    }

    private void initListeners() {
        sevgi_testi.setOnClickListener(this);
        ummon.setOnClickListener(this);
        benom.setOnClickListener(this);
        prank.setOnClickListener(this);
        ussd.setOnClickListener(this);
        weather.setOnClickListener(this);
        tarjimon.setOnClickListener(this);
    }

    private void initViews() {
        sevgi_testi = root.findViewById(R.id.btn_sevgi_testi);
        ummon = root.findViewById(R.id.btn_ummon);
        benom = root.findViewById(R.id.btn_benom);
        prank = root.findViewById(R.id.btn_prank);
        ussd = root.findViewById(R.id.btn_ussd);
        weather = root.findViewById(R.id.btn_weather);
        tarjimon = root.findViewById(R.id.btn_translator);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_sevgi_testi:
                packageApp = "com.shakhzod.sevgitesti";
                break;
            case R.id.btn_ummon:
                packageApp = "com.shakhzod.ummontaronalari";
                break;
            case R.id.btn_benom:
                packageApp = "com.music.benomtaronalari";
                break;
            case R.id.btn_prank:
                packageApp = "com.prank.scaryprank";
                break;
            case R.id.btn_translator:
                packageApp = "com.shakhzod.translator";
                break;
            case R.id.btn_ussd:
                packageApp = "com.shakhzod.ussd";
                break;
            case R.id.btn_weather:
                packageApp = "com.shakhzod.weatherapp";
                break;
        }
        try {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=" + packageApp)));
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=" + packageApp)));
        }
    }
}