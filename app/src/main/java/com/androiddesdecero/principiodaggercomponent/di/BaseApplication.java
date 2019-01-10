package com.androiddesdecero.principiodaggercomponent.di;

import android.app.Application;

/**
 * Created by albertopalomarrobledo on 4/1/19.
 */

public class BaseApplication extends Application {

    private MotorComponent motorComponent;

    private CocheComponent cocheComponent;

    private CocheSubComponent cocheSubComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        motorComponent = DaggerMotorComponent
                .builder()
                .build();

        /*
        A diferencia de una clase padre, una component dependiente necesita indicar en su
        constructor el componente padre como vemos.
         */
        cocheComponent = DaggerCocheComponent
                .builder()
                .motorComponent(getMotorComponent())
                .build();


    }

    /*

     */
    public CocheSubComponent plusCocheSubComponent(){
        if(cocheSubComponent == null){
            cocheSubComponent = motorComponent.plusCocheSubComponent(new CocheModule());
        }
        return cocheSubComponent;
    }

    public MotorComponent getMotorComponent(){
        return motorComponent;
    }

    public CocheComponent getCocheComponent(){
        return cocheComponent;
    }
}
