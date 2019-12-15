package com.example.andriod.financemanager;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import com.google.android.material.navigation.NavigationView;

public class nav_head_changer extends AppCompatActivity {
    Variable_app va3 =new Variable_app();
    ImageView image;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
      //  setContentView(R.layout.nav_header_sandwitch);
       /* image.setImageResource(R.drawable.boyicon);
        image.setImageDrawable(getDrawable(R.drawable.boyicon));
        if(va3.isGender()){
            image.setImageResource(R.drawable.boyicon);
        }
        else{
            image.setImageResource(R.drawable.girlicon);
        }*/
    }
}
