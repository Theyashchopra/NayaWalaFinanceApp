package com.example.andriod.financemanager;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        LogoLauncher ll=new LogoLauncher();
        ll.start();

    }

    class LogoLauncher extends Thread {
        public void run() {
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            startActivity(new Intent(SplashScreen.this, MainActivity.class));
            SplashScreen.this.finish();
        }
    }
}
