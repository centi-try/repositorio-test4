package com.example.test4.ui.infoSenadores;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.test4.R;

public class SenadoresFragment extends Fragment {

    private SenadoresViewModel senadoresViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        senadoresViewModel =
                ViewModelProviders.of(this).get(SenadoresViewModel.class);
        View root = inflater.inflate(R.layout.fragment_senadores, container, false);
        final TextView textView = root.findViewById(R.id.text_senadores);
        senadoresViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}