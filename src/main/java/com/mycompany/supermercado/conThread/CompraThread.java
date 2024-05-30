package com.mycompany.supermercado.conThread;

import com.mycompany.supermercado.domain.ClienteProducto;

public class CompraThread implements Runnable {
    private CajeraProducto cajera;
    private ClienteProducto cliente;
    private long timestamp;

    public CompraThread(CajeraProducto cajera, ClienteProducto cliente, long timestamp) {
        this.cajera = cajera;
        this.cliente = cliente;
        this.timestamp = timestamp;
    }

    @Override
    public void run() {
        cajera.procesarComprar(cliente, timestamp);
    }
}
