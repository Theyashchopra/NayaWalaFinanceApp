package com.example.andriod.financemanager.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.andriod.financemanager.Variable_app;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<Float> mText1;
    private MutableLiveData<String> mText3;
    private MutableLiveData<Float> mText4;
    private Variable_app va3=new Variable_app();
    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Money Spent");
        mText1 = new MutableLiveData<>();
        mText1.setValue((va3.getMoney_spent()));
        mText3 = new MutableLiveData<>();
        mText3.setValue(("Money Left"));
        mText4 = new MutableLiveData<>();
        mText4.setValue(va3.getTotal_money()-va3.getMoney_spent());
    }

    public LiveData<String> getText1() {
        return mText;
    }
    public MutableLiveData<Float> getText2() {
        return mText1;
    }
    public LiveData<String> getText3() {
        return mText3;
    }
    public MutableLiveData<Float> getText4() {
        return mText4;
    }
}