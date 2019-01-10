package com.androiddesdecero.principiodaggercomponent.di;

import com.androiddesdecero.principiodaggercomponent.MainActivity;

import dagger.Component;

/**
 * Created by albertopalomarrobledo on 4/1/19.
 */

/*
Dependent Component
Componentes Dependientes -> Utilizamos este metodo cuando deseamos mantener dos
componentes independientes.
Indicamos explicitamente que CocheComponent Depende de MotorComponent a través de dependencies = MotorComponent.class
En MotorComponent no indicamos que CocheComponent depende de el, por ello los componentes se mantienen
independientes
Dos componentes dependientes no puden tener el mismo scope. Habrá que crear scope diferentes.
*/

@Component(modules=CocheModule.class, dependencies = MotorComponent.class)
public interface CocheComponent {
    void inject(MainActivity mainActivity);
}
