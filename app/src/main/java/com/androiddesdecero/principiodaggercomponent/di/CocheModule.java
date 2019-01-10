package com.androiddesdecero.principiodaggercomponent.di;

import com.androiddesdecero.principiodaggercomponent.Coche;
import com.androiddesdecero.principiodaggercomponent.Motor;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by albertopalomarrobledo on 4/1/19.
 */
/*
Para poder organizar bien nuestras objetos creados con Dagger nos da la opción de utilizar
los componentes dependientes y subcomponentes. Es decir no queremos tener en un clase Module
mezclado objetos de tipo coche, con objetos tipo motor.
O no queremos tener objetos tipo Fragment, con servicios, con objetos Shared Preferences, con
objetos Retrofit, etc. Sino que lo queremos tener todo extructurado.
Pero si queremos que por ejemplo como vemos en este caso, que un objeto Coche para poder ser creado
necesite de un objeto Motor, lo pueda utilizar el que nos proporcina Dagger.
 */


@Module
public class CocheModule {

    @Provides
    public Coche providesMotorDiesel(Motor motor){
        return new Coche(motor);
    }

    @Named("coche_electrico")
    @Provides
    public Coche providesMotorElectrico(@Named("electrico")Motor motor){
        return new Coche(motor);
    }

    //
    @Named("coche_gasolina")
    @Provides
    public Coche providesMotorGasolina(@Named("gasolina")Motor motor){
        return new Coche(motor);
    }
}
