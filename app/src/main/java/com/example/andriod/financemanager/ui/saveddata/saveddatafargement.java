package com.example.andriod.financemanager.ui.saveddata;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.andriod.financemanager.R;
import com.example.andriod.financemanager.add_exp;
import com.example.andriod.financemanager.presenters.DisplayNoteActivityPresenter;
import com.example.andriod.financemanager.ui.about.ToolsViewModel;
import com.example.andriod.financemanager.view.EditNoteActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class saveddatafargement extends Fragment {

    private saveddatamodel toolsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        toolsViewModel =
                ViewModelProviders.of(this).get(saveddatamodel.class);
        View root = inflater.inflate(R.layout.activity_note_list_view, container, false);
       /* final TextView textView = root.findViewById(R.id.text_tools);
        toolsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        FloatingActionButton fab = root.findViewById(R.id.add_note_floating_button);
        fab.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(view.getContext(), EditNoteActivity.class));
            }
        });
        return root;
    }
}
