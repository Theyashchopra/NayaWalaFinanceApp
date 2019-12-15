package com.example.andriod.financemanager.ui.home;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.andriod.financemanager.R;
import com.example.andriod.financemanager.Variable_app;
import com.example.andriod.financemanager.add_exp;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeFragment extends Fragment {
    private Variable_app va3=new Variable_app();

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textViewSpent = root.findViewById(R.id.text_spent);
        homeViewModel.getText1().observe(this, new Observer<String>() {
            @Override
            public void onChanged( String s) {
                textViewSpent.setText(s);
            }
        });
        final TextView tvSpent=root.findViewById(R.id.moneySpent);
        homeViewModel.getText2().observe(this, new Observer<Float>() {
            @Override
            public void onChanged( Float  s) {
                tvSpent.setText(String.valueOf(s));
            }
        });
        final TextView textViewLeft = root.findViewById(R.id.text_left);
        homeViewModel.getText3().observe(this, new Observer<String>() {
            @Override
            public void onChanged( String s) {
                textViewLeft.setText(s);
            }
        });
        final TextView tvLeft=root.findViewById(R.id.moneyleft);
        homeViewModel.getText4().observe(this, new Observer<Float>() {
            @Override
            public void onChanged( Float s) {
                tvLeft.setText(String.valueOf(s));
            }
        });
        FloatingActionButton fab = root.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(view.getContext(), add_exp.class));
            }
        });
        return root;
    }
}