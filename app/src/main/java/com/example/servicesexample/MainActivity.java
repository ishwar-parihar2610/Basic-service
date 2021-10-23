package com.example.servicesexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

import com.example.servicesexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.startServicesBtn.setOnClickListener(this);
        binding.stopServicesBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==binding.startServicesBtn){
            startService(new Intent(this,Services.class));
        }else if (v==binding.stopServicesBtn){
            stopService(new Intent(this,Services.class));

        }
    }
}