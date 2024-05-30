package com.mycompany.supermercado.conThread;

import com.mycompany.supermercado.domain.ClienteProducto;
import com.mycompany.supermercado.domain.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pablo
 */
public class CajeraProductoMain {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);

        ClienteProducto cliente1 = new ClienteProducto("Diego Chamorro", productos);
        ClienteProducto cliente2 = new ClienteProducto("Elon Musk", productos);
        ClienteProducto cliente3 = new ClienteProducto("Steve Wozniak", productos);

        long initialTime = System.currentTimeMillis();

        CajeraProducto cajeraUno = new CajeraProducto("Andrea");
        CajeraProducto cajeraDos = new CajeraProducto("Claudia");
        CajeraProducto cajeraTres = new CajeraProducto("Judoca");

        Thread hilo1 = new Thread(new CompraThread(cajeraUno, cliente1, initialTime));
        Thread hilo2 = new Thread(new CompraThread(cajeraDos, cliente2, initialTime));
        Thread hilo3 = new Thread(new CompraThread(cajeraTres, cliente3, initialTime));

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }

    private static void setProductos(List<Producto> productos) {
        Producto productoUno = new Producto("Disco SSD 1 TB", 900, 6);
        Producto productoDos = new Producto("Tenis", 1200, 9);
        Producto productoTres = new Producto("Reloj", 5500, 10);

        productos.add(productoUno);
        productos.add(productoDos);
        productos.add(productoTres);
    }
}
