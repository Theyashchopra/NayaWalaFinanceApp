package com.example.andriod.financemanager.ui.dataanalysis;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DataAnalysisViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DataAnalysisViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}