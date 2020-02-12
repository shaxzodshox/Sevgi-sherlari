package com.shlsoft.sevgisherlari.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.shlsoft.sevgisherlari.activities.AralashActivity;
import com.shlsoft.sevgisherlari.activities.KulgiActivity;
import com.shlsoft.sevgisherlari.activities.OilaActivity;
import com.shlsoft.sevgisherlari.R;
import com.shlsoft.sevgisherlari.activities.SevgiActivity;
import com.shlsoft.sevgisherlari.activities.DostlikActivity;
import com.shlsoft.sevgisherlari.activities.TabrikActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.Objects;

public class HomeFragment extends Fragment implements View.OnClickListener{

    //AdMob ad
    InterstitialAd mInterstitialAd;
    private HomeViewModel homeViewModel;
    private LinearLayout sevgi_btn, oila_btn, dostlik_btn, tabrik_btn, kulgili_btn, aralash_btn;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        sevgi_btn = root.findViewById(R.id.sevgi_btn);
        oila_btn = root.findViewById(R.id.oila_btn);
        dostlik_btn = root.findViewById(R.id.dostlik_btn);
        tabrik_btn = root.findViewById(R.id.tabrik_btn);
        kulgili_btn = root.findViewById(R.id.kulgili_btn);
        aralash_btn = root.findViewById(R.id.aralash_btn);

        sevgi_btn.setOnClickListener(this);
        oila_btn.setOnClickListener(this);
        dostlik_btn.setOnClickListener(this);
        tabrik_btn.setOnClickListener(this);
        kulgili_btn.setOnClickListener(this);
        aralash_btn.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sevgi_btn:
                showAd(); //Interstitial ad
                startActivity(new Intent(getContext(), SevgiActivity.class));
                break;

            case R.id.oila_btn:
                showAd(); //Interstitial ad
                startActivity(new Intent(getContext(), OilaActivity.class));
                break;

            case R.id.dostlik_btn:
                showAd(); //Interstitial ad
                startActivity(new Intent(getContext(), DostlikActivity.class));
                break;

            case R.id.tabrik_btn:
                showAd(); //Interstitial ad
                startActivity(new Intent(getContext(), TabrikActivity.class));
                break;

            case R.id.kulgili_btn:
                showAd(); //Interstitial ad
                startActivity(new Intent(getContext(), KulgiActivity.class));
                break;

            case R.id.aralash_btn:
                showAd(); //Interstitial ad
                startActivity(new Intent(getContext(), AralashActivity.class));
                break;
        }
    }

    private void showAd(){
        mInterstitialAd = new InterstitialAd(Objects.requireNonNull(getContext()));
        mInterstitialAd.setAdUnitId("ca-app-pub-2026382780923969/3387134298");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                if(mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                }
            }
        });
    }
}