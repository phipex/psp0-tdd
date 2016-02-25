package com.phipex;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sony vaio on 25/02/2016.
 */
public class DobleLinkedListTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void testNuevaListaVacia() throws Exception {
        DobleLinkedList nueva = new DobleLinkedList();

        Assert.assertNotNull("La lista no debe ser null",nueva);


    }

    @Test
    public void testNuevaListaConCabeza() throws Exception {
        DobleLinkedList nueva = new DobleLinkedList();

        Nodo cabeza = nueva.getCabeza();

        Assert.assertNotNull(cabeza);

    }

    @Test
    public void testSiguenteListaVacia() throws Exception {
        DobleLinkedList nueva = new DobleLinkedList();

        Nodo cabeza = nueva.getCabeza();

        Nodo experado = cabeza;

        Nodo retornado = cabeza.siguiente();

        Assert.assertEquals("Al ser vacia siguiente debe se la cabeza",experado,retornado);

    }

    @Test
    public void testAnteriorListaVacia() throws Exception {
        DobleLinkedList nueva = new DobleLinkedList();

        Nodo cabeza = nueva.getCabeza();

        Nodo experado = cabeza;

        Nodo retornado = cabeza.anterior();

        Assert.assertEquals("Al ser vacia anterior debe ser la cabeza",experado,retornado);

    }


}