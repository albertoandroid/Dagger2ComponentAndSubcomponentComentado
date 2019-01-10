package com.androiddesdecero.principiodaggercomponent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.androiddesdecero.principiodaggercomponent.di.BaseApplication;

import javax.inject.Inject;

public class Main2Activity extends AppCompatActivity {

    @Inject
    Motor motor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ((BaseApplication)getApplication()).getMotorComponent().inject(this);
        Log.d("TAG11", motor.getTipoMotor());
    }
}
