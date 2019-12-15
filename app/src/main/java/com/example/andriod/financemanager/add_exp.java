package com.example.andriod.financemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
public class add_exp extends AppCompatActivity {
    Variable_app va2=new Variable_app();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_exp);
        Toolbar tool=findViewById(R.id.toolbar);
        setActionBar(tool);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setDisplayShowHomeEnabled(true);
    }

    public void exp_adder(View view) {
        TextView e_ne=findViewById(R.id.e_newexpense);
        Toast.makeText(this,"Added Expense",Toast.LENGTH_SHORT).show();
            if (!(e_ne.getText().toString().equals(""))) {
                va2.setMoney_spent(Float.parseFloat(e_ne.getText().toString()));
            }
        Intent i11 =new Intent(this,sandwitch.class);
        startActivity(i11);
    }
}
