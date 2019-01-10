package com.androiddesdecero.principiodaggercomponent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.androiddesdecero.principiodaggercomponent.di.BaseApplication;

import javax.inject.Inject;
import javax.inject.Named;

public class Main3Activity extends AppCompatActivity {

    @Inject
    Motor motor;

    /*
    Aqui vemos la principal diferencia con las dependencias de componentes y es que desde el
    subcomponente tenemos acceso a coche_gasolina que no teniamos en dependencia de componentes
    al no haberla declarado explicitamente
     */
    @Named("coche_gasolina")
    @Inject
    Coche motorGasolina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ((BaseApplication)getApplication()).plusCocheSubComponent().inject(this);
        Log.d("TAG1", motor.getTipoMotor());
        Log.d("TAG1", motorGasolina.getCoche());
    }
}
