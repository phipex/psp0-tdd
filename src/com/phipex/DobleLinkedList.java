package com.phipex;

/**
 * Created by sony vaio on 25/02/2016.
 */
public class DobleLinkedList {

    private Nodo cabeza;

    public DobleLinkedList() {
        this.cabeza = new Nodo();
        this.cabeza.setSiguiente(this.cabeza);
        this.cabeza.setAnterior(this.cabeza);
    }


    public Nodo getCabeza() {
        return cabeza;
    }
}
