package com.androiddesdecero.principiodaggercomponent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.androiddesdecero.principiodaggercomponent.di.BaseApplication;
import com.androiddesdecero.principiodaggercomponent.di.DaggerCocheComponent;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    @Inject
    Motor motor;

    @Inject
    Coche motorDiesel;

    @Named("coche_electrico")
    @Inject
    Coche motorElectrico;

    /*
    Nos da error debido a que no lo hemos declarado explicitamente en MotorComponent
    Es decir los componentes dependientes solo pueden utilizar los objetos que han sido
    declarados explicitamente en la clase padre.
     */
    //@Named("coche_gasolina")
    //@Inject
    //Coche motorGasolina;

    private Button bt;
    private Button btSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((BaseApplication)getApplication()).getCocheComponent().inject(this);
        setUpView();

        Log.d("TAG1", motor.getTipoMotor());
        Log.d("TAG1", motorDiesel.getCoche());
        Log.d("TAG1", motorElectrico.getCoche());
    }
    private void setUpView(){
        bt = findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Main2Activity.class));
            }
        });

        btSub = findViewById(R.id.btSub);
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Main3Activity.class));
            }
        });
    }
}
