package com.androiddesdecero.principiodaggercomponent.di;

import com.androiddesdecero.principiodaggercomponent.Main2Activity;
import com.androiddesdecero.principiodaggercomponent.MainActivity;
import com.androiddesdecero.principiodaggercomponent.Motor;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by albertopalomarrobledo on 4/1/19.
 */


@Component(modules = {MotorModule.class})
public interface MotorComponent {
    /*
    El componente Padre debe declarar explicitamente los objetos que van a ser utilizados
    por los componentes dependientes, pero no para los subcomponentes como veremos más adelante
    Esta es la gran diferencia entre Component Dependencies y Subcomponent.

     */
    Motor motor();
    @Named("electrico")Motor motorElectrico();

    /*
    Luego indicamos los injects
     */
    void inject(Main2Activity main2Activity);



    /*
    SubComponent
    El componente padre en este caso MotorComponent esta obligado a declarar
    el subcomponente dentre de su interfaz.
     */
    CocheSubComponent plusCocheSubComponent(CocheModule cocheModule);
}
