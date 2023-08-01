package com.digitalhouse.backend;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {

    //tipo de dato de la key, tipo de dato del objeto asociado a esa key
    private static final Map<String, Arbol> ArbolListado = new HashMap<>();
    public static Arbol crearArbol(int alto, int ancho, String color){

        String key = "key:" + alto + ":" + ancho + ":"+ color;
        System.out.println(key);

        if(!ArbolListado.containsKey(key)){
            //crear la compu y la agregar con su key a la coleccion
            Arbol arbol = new Arbol(alto,ancho,color);
            ArbolListado.put(key, arbol);
            //computadorasLigeras.put(key, new Computadora(ram, disco));
            System.out.println("arbol creado" );
        } else {
            System.out.println("arbol encontrado");
        }

        return ArbolListado.get(key);


    }

    public static  Map <String, Arbol> getArbolListado() {
        return ArbolListado;
    }

}
