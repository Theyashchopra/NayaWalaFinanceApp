package com.example.andriod.financemanager.presenters;

import android.content.Context;
import android.os.Bundle;

import com.example.andriod.financemanager.model.data.Note;
import com.example.andriod.financemanager.model.handlers.DBHandler;
import com.example.andriod.financemanager.model.util.BundleExtraUtil;
import com.example.andriod.financemanager.view.DisplayNoteActivity;

public class DisplayNoteActivityPresenter {
    private DisplayNoteActivityView view;
    private DBHandler handler;
    private Note note;

    public DisplayNoteActivityPresenter(Context context, DisplayNoteActivity view) {
        this.view = view;
        this.handler = new DBHandler(context);
    }

    public interface DisplayNoteActivityView{
        void displayInformation(String title, String content);
    }

    public void getInformation(Bundle extras){
        String titleString = "";
        String contentString = "";
        int id;
        if (extras != null){
            id = extras.getInt(BundleExtraUtil.KEY_NOTE_ID);
            note = handler.getNote(id);
            titleString = note.getTitle();
            contentString = note.getContent();
        }
        view.displayInformation(titleString, contentString);
    }

    public int getNoteId() {
        return note.getId();
    }
}
