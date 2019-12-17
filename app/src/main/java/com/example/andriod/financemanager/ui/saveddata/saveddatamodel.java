package com.example.andriod.financemanager.ui.saveddata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class saveddatamodel extends ViewModel {

    private MutableLiveData<String> mText;

    public saveddatamodel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is history fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
