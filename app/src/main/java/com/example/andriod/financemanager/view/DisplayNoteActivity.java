package com.example.andriod.financemanager.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.andriod.financemanager.R;
import com.example.andriod.financemanager.model.util.BundleExtraUtil;
import com.example.andriod.financemanager.presenters.DisplayNoteActivityPresenter;

public class DisplayNoteActivity extends AppCompatActivity
        implements DisplayNoteActivityPresenter.DisplayNoteActivityView, View.OnClickListener {

    TextView contentTextView;
    TextView titleTextView;
    ImageButton backButton;

    DisplayNoteActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_note);

        presenter = new DisplayNoteActivityPresenter(this, this);

        titleTextView = findViewById(R.id.title_text_view);
        contentTextView = findViewById(R.id.content_text_view);
        backButton = findViewById(R.id.back_button);

        backButton.setOnClickListener(this);
        titleTextView.setOnClickListener(this);
        contentTextView.setOnClickListener(this);

        presenter.getInformation(getIntent().getExtras());
    }

    @Override
    public void displayInformation(String title, String content) {
        titleTextView.setText(title);
        contentTextView.setText(content);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.title_text_view:
                goToEditNoteActivity();
                break;

            case R.id.content_text_view:
                goToEditNoteActivity();
                break;

            case R.id.back_button:
                startActivity(new Intent(this, NoteListActivity.class));
                break;

        }
    }

    private void goToEditNoteActivity(){
        Intent intent = new Intent(this, EditNoteActivity.class);
        intent.putExtra(BundleExtraUtil.KEY_NOTE_ID, presenter.getNoteId());
        startActivity(intent);
    }
}
