package com.androiddesdecero.principiodaggercomponent.di;

import com.androiddesdecero.principiodaggercomponent.Main3Activity;
import com.androiddesdecero.principiodaggercomponent.MainActivity;

import dagger.Subcomponent;

/**
 * Created by albertopalomarrobledo on 4/1/19.
 */

/*
Utilizamos los SubComponentes Cuando queremos tener dos componentes acoplados.
La etiqueta es @Subcomponent
Y en Component padre tenemos que crear la siguiente clase:
CocheSubComponent plusCocheSubComponent(CocheModule cocheModule);
Es decir el el componente CocheSubComponent solo se pude inicizalizar a través del motorComponent
con su metodo plusCocheSubComponent(CocheModule cocheModule);

La principal diferencia es que el subcomponente tiene acceso a todos los objetos del padre,
sin necesidad que este los declare explicitamente como vimos que ocurria en el otro caso.
Otra diferencia es que con subomponent los componentes estan acoplados y con componente dependencia son independientes

Los subcomponentes solo pueden tener un Padre
 */

@Subcomponent(modules=CocheModule.class)
public interface CocheSubComponent {
    void inject(Main3Activity main3Activity);
}
