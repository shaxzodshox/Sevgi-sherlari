package com.android.sevgisherlari.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.android.sevgisherlari.OilaActivity;
import com.android.sevgisherlari.R;
import com.android.sevgisherlari.SevgiActivity;
import com.android.sevgisherlari.DostlikActivity;
import com.android.sevgisherlari.TabrikActivity;

public class HomeFragment extends Fragment implements View.OnClickListener{

    private HomeViewModel homeViewModel;
    private LinearLayout sevgi_btn, oila_btn, dostlik_btn, tabrik_btn;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        sevgi_btn = root.findViewById(R.id.sevgi_btn);
        oila_btn = root.findViewById(R.id.oila_btn);
        dostlik_btn = root.findViewById(R.id.dostlik_btn);
        tabrik_btn = root.findViewById(R.id.tabrik_btn);

        sevgi_btn.setOnClickListener(this);
        oila_btn.setOnClickListener(this);
        dostlik_btn.setOnClickListener(this);
        tabrik_btn.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sevgi_btn:
                startActivity(new Intent(getContext(), SevgiActivity.class));
                break;

            case R.id.oila_btn:
                startActivity(new Intent(getContext(), OilaActivity.class));
                break;

            case R.id.dostlik_btn:
                startActivity(new Intent(getContext(), DostlikActivity.class));
                break;

            case R.id.tabrik_btn:
                startActivity(new Intent(getContext(), TabrikActivity.class));
                break;
        }
    }
}