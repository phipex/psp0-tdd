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
    public void testSiguenteListaVacia() throws Exception {
        DobleLinkedList nueva = new DobleLinkedList();

        Nodo experado = null;

        Nodo retornado = nueva.siguiente();

        Assert.assertEquals("Al ser vacia siguiente debe ser nullo",experado,retornado);

    }
}