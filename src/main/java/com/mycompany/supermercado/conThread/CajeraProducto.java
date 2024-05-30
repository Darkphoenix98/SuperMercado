package com.mycompany.supermercado.conThread;

import com.mycompany.supermercado.domain.ClienteProducto;
import com.mycompany.supermercado.domain.Producto;


public class CajeraProducto {
    private String nombreCajera;

    public CajeraProducto(String nombreCajera) {
        this.nombreCajera = nombreCajera;
    }

  public void procesarComprar(ClienteProducto cliente, long timeStanp) {
        System.out.println("La cajera " + this.nombreCajera + " comienza a procesar la compra del cliente: "
            + cliente.getNombre() + ", en el tiempo " + (System.currentTimeMillis() - timeStanp) / 1000
            + " seg."
               
        );
        System.out.println();
        int contCliente = 1;
        for (Producto producto : cliente.getProductos()) {
            this.esperarXSegundos();
            System.out.println("Procesando el producto " + contCliente + "; "
                 +"Cajera:" + this.nombreCajera+ "," + " nombre producto: "+ producto.getNombre() + ","
                + " precio producto: " + producto.getPrecio() + ","
                + " cantidad de productos: " + producto.getCantidad()
                + " costo total del producto " + " =>" + producto.getCantidad() * producto.getPrecio()
                + " ->Tiempo: " + (System.currentTimeMillis() - timeStanp) / 1000 + " seg.");
            contCliente++;
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        System.out.println("=====" + "La cajera " + this.nombreCajera + " ha terminado de procesar a " + cliente.getNombre()
            + " en el tiempo: " + (System.currentTimeMillis() - timeStanp) / 1000 + " seg.");
    } 

    private void esperarXSegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}