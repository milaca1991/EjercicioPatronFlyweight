package com.digitalhouse.backend;

public class Arbol {
    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Arbol(int alto, int ancho, String color) {
        this.alto = alto;
        this.ancho = ancho;
        this.color = color;
        this.id="ARB"+alto+"-"+ancho+"-"+ color;
        contador++;
        System.out.println("Existencias: " + contador);
        System.out.println(id);
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Arbol(String id) {
        this.id = id;
    }

    private String id;
    private int alto;
    private int ancho;
    private String color;

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Arbol.contador = contador;
    }

    private static int contador;
}
