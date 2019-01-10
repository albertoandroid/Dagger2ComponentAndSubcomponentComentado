package com.androiddesdecero.principiodaggercomponent.di;

import com.androiddesdecero.principiodaggercomponent.Motor;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by albertopalomarrobledo on 4/1/19.
 */

@Module
public class MotorModule {

    @Provides
    public Motor providesMotorDiesel(){
        return new Motor("Diesel");
    }

    @Named("electrico")
    @Provides
    public Motor providesMotorElectrico(){
        return new Motor("Electrico");
    }

    @Named("gasolina")
    @Provides
    public Motor providesMotorGasolina(){
        return new Motor("Gasolina");
    }
}
