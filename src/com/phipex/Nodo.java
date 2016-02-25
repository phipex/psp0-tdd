package com.phipex;

/**
 * Created by sony vaio on 25/02/2016.
 */
public class Nodo {


    private Nodo siguiente;
    private Nodo anterior;

    public Nodo siguiente() {
        return siguiente;
    }

    public Nodo anterior() {
        return anterior;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
