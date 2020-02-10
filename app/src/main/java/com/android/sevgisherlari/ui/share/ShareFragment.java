package com.android.sevgisherlari.ui.share;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.android.sevgisherlari.R;

public class ShareFragment extends Fragment {

    private ShareViewModel shareViewModel;

    private String packageName = "com.android.sevgisherlari";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        shareViewModel =
                ViewModelProviders.of(this).get(ShareViewModel.class);
        View root = inflater.inflate(R.layout.fragment_share, container, false);

        String URL = "https://play.google.com/store/apps/details?id=" + packageName;
        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_TITLE,"SEVGI SHE'RLARI");
        shareIntent.putExtra(Intent.EXTRA_TEXT,URL);
        shareIntent.setType("text/plain");
        startActivity(shareIntent);
        getActivity().onBackPressed();
        return root;
    }
}