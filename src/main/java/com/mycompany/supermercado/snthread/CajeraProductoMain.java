package com.mycompany.supermercado.snthread;

import com.mycompany.supermercado.domain.ClienteProducto;
import com.mycompany.supermercado.domain.Producto;
import java.util.ArrayList;
import java.util.List;

public class CajeraProductoMain {
     public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);

        ClienteProducto cliente1 = new ClienteProducto("Diego Champrro" , productos);
        ClienteProducto cliente2 = new ClienteProducto("Elon Musk" , productos);
        ClienteProducto cliente3 = new ClienteProducto("Steve Wozniak" , productos);

        long initialTime = System.currentTimeMillis();
        CajeraProducto cajeraUno = new CajeraProducto("Andrea");
        CajeraProducto cajeraDos = new CajeraProducto("Claudia");
        CajeraProducto cajeraTres = new CajeraProducto("Judoca");

        cajeraUno.procesarComprar(cliente1, initialTime);
        cajeraDos.procesarComprar(cliente2, initialTime);
        cajeraTres.procesarComprar(cliente3, initialTime);
    }

    private static void setProductos(List<Producto> productos) {
        Producto productoUno = new Producto("Disco SSD 1 TB" , 900, 6);
        Producto productoDos = new Producto("Tenis" , 1200, 9);
        Producto productoTres = new Producto("Reloj" , 5500, 10);

        productos.add(productoUno);
        productos.add(productoDos);
        productos.add(productoTres);
    }
}
