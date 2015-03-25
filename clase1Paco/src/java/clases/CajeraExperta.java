/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author alberto
 */
public class CajeraExperta implements Runnable {

    private List<Pedido> pedidos;
    private String nombre;
    HashMap<Integer, Integer> tiempoPedidos = new HashMap<Integer, Integer>();

    public final void initTiemposCajera() {
        tiempoPedidos.put(1, 1);//tiempo en procesar el producto 1
        tiempoPedidos.put(2, 2);//tiempo en procesar el producto 2
        tiempoPedidos.put(3, 3);//tiempo en procesar el producto 3
        tiempoPedidos.put(4, 5);//tiempo en procesar el producto 4
    }

    public CajeraExperta(List<Pedido> pedidos, String nombre) {
        this.nombre = nombre;
        initTiemposCajera();
        for (Pedido actual : pedidos) {//establece los tiempos de los pedidos en base a la cajera
            actual.setTiempoPedido(tiempoPedidos.get(actual.getTipoPedido()));
        }
        this.pedidos = pedidos;
    }

    @Override
    public void run() {

        List<Integer> lista = new ArrayList<Integer>();
        Long tInicial = System.currentTimeMillis();
        Long tFinal = 0L;
        int diviTiempo = 10;//parte el tiempo 
        for (Pedido pActual : pedidos) {
            try {
                Thread.sleep(pActual.getTiempoPedido() * diviTiempo * pActual.getCantidad());
                tFinal += System.currentTimeMillis() - tInicial;//suma el tiempo en milisegundos
                System.out.println("El pedido se ejecutó en: " + (System.currentTimeMillis() - tInicial)
                        + ", cantidad: " + pActual.getCantidad() + ", tipo pedido: " + pActual.getTipoPedido());
            } catch (Exception e) {
            }
        }
        System.out.println("Tiempo de ejecución: " + (tFinal / diviTiempo));

    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
