/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import Dao.CentrosDiversionFacadeLocal;
import Dao.PaisFacadeLocal;
import Dao.TipoLugarFacadeLocal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import models.CentrosDiversion;
import models.Pais;

/**
 *
 * @author alberto
 */
@SessionScoped
@ManagedBean(name = "listaController2")
public class Listas1 extends MiForm {

    @EJB
    CentrosDiversionFacadeLocal centrosDiversion;
    @EJB
    PaisFacadeLocal paisFacadeLocal;
    @EJB
    TipoLugarFacadeLocal tipoLugarFacadeLocal;

    public void initLista() {
        this.getMensaje();
        List<CentrosDiversion> nueva = new ArrayList<CentrosDiversion>();
        List<PaisFacadeLocal> paises = new ArrayList<PaisFacadeLocal>();
        CentrosDiversion valor = new CentrosDiversion();//valor 1
        Pais pais = new Pais();

        valor.setCapacidadPersonas(1);//agregar valores al objeto
        valor.setCodigo(2);//agregar valores al objeto
        nueva.add(valor);
//        valor = new Que();//valor 2
        valor.setCapacidadPersonas(1);//agregar valores al objeto
        valor.setCodigo(2);//agregar valores al objeto
        nueva.add(valor);
//        valor = new Que();//valor 3
        valor.setCapacidadPersonas(1);//agregar valores al objeto
        valor.setCodigo(2);//agregar valores al objeto
        nueva.add(valor);
//        this.setListaDatos(nueva);

        this.setListaPais(paisFacadeLocal.findAll());
        this.setListaLugar(tipoLugarFacadeLocal.findAll());
        this.setListaDatos(centrosDiversion.findAll());
        claseHilos();
    }

    public void claseHilos() {
        List<Pedido> pedido1 = new ArrayList<Pedido>();
        Pedido nuevo = new Pedido();
        nuevo.setCantidad(20);
        nuevo.setTipoPedido(4);
        pedido1.add(nuevo);
        nuevo = new Pedido();
        nuevo.setCantidad(50);
        nuevo.setTipoPedido(3);
        pedido1.add(nuevo);

        List<Pedido> pedido2 = new ArrayList<Pedido>();
        nuevo = new Pedido();
        nuevo.setCantidad(10);
        nuevo.setTipoPedido(3);
        pedido2.add(nuevo);
        nuevo = new Pedido();
        nuevo.setCantidad(70);
        nuevo.setTipoPedido(4);
        pedido2.add(nuevo);

        Cajera usuario1 = new Cajera(pedido1, "usuario1");
        Cajera usuario2 = new Cajera(pedido2, "usuario2");

        Thread hilo1 = new Thread(usuario1);
        Thread hilo2 = new Thread(usuario2);
        hilo1.start();
        hilo2.start();

//        List<Cajera> hilo_ = new ArrayList<Cajera>();
//        hilo_.add(usuario1);
//        hilo_.add(usuario2);
//
//        ExecutorService executor = Executors.newFixedThreadPool(hilo_.size());
//        for (Cajera cliente : hilo_) {
//            Runnable cajera = cliente;
//            executor.execute(cajera);
//        }
//        executor.shutdown();	// Cierro el Executor
//        while (!executor.isTerminated()) {
//            // Espero a que terminen de ejecutarse todos los procesos 
//            // para pasar a las siguientes instrucciones 
//        }
    }

    public void initLista2() {
        List<CentrosDiversion> nueva = new ArrayList<CentrosDiversion>();
        List<PaisFacadeLocal> paises = new ArrayList<PaisFacadeLocal>();
        CentrosDiversion valor = new CentrosDiversion();//valor 1
        Pais pais = new Pais();

        valor.setCapacidadPersonas(1);//agregar valores al objeto
        valor.setCodigo(2);//agregar valores al objeto
        nueva.add(valor);
//        valor = new Que();//valor 2
        valor.setCapacidadPersonas(1);//agregar valores al objeto
        valor.setCodigo(2);//agregar valores al objeto
        nueva.add(valor);
//        valor = new Que();//valor 3
        valor.setCapacidadPersonas(1);//agregar valores al objeto
        valor.setCodigo(2);//agregar valores al objeto
        nueva.add(valor);
//        this.setListaDatos(nueva);

        this.setListaPais(paisFacadeLocal.findAll());
        this.setListaLugar(tipoLugarFacadeLocal.findAll());
        this.setListaDatos(centrosDiversion.findAll());
//        this.setListaDatos(nueva);
    }

    public void crear() {
        centrosDiversion.create(this.nuevo);
    }

    public boolean pruebaContains(Que valor) {//verificar si un elemento ya existe en la lista
        boolean ret = false;
        ret = this.getListaDatos().contains(valor);//ejemplo base
        return ret;
    }

    public Que pruebaGet(int index) {//devolver el elemento de la lista en esa posicion
        Que ret = new Que();
        return ret;
    }

    public List<Que> pruebaRemove(Que valor) {//devolver la lista sin el elemento
        List<Que> ret = new ArrayList<Que>();
        return ret;
    }

    public List<Que> pruebaRemoveIndex(int index) {//devolver la lista sin el elemento eliminado
        List<Que> ret = new ArrayList<Que>();
        return ret;
    }

    public int pruebaSize() {//obtener el tamaño de la lista
        int ret = 0;
        valorRecibido = 10;
        return ret;
    }

    public void lista1() {
        List variable = new ArrayList();
        variable.add(null);

        List<Que> nueva = new ArrayList<Que>();
        Que valor = new Que();
        valor.setB1("valor1");//agregar valores al objeto
        valor.setB2("valor2");//agregar valores al objeto
        nueva.add(valor);//agregar valores a la lista

        nueva.contains(valor);//devuelve true o false si el objeto enviado como parametro existe en la lista 
        //(si es objeto complejo como entidad debe ser exactamente el mismo valor referenciado, sino dará false, 
        //por el contrario si es un objeto simple como Double, Integer, etc hace la comparación sin problema)
        Que valorNuevo = new Que();
        valor.setB1("valor1");//agregar valores al objeto
        valor.setB2("valor2");//agregar valores al objeto
        nueva.contains(valorNuevo);//retorna false?? aunque tenga los mismos atributos que la variable valor??


        nueva.get(0);//obtiene el elemento en la posisión cero de la lista 
        nueva.remove(valor);//remueve un elemento de una lista, hacer prueba como contains
        nueva.size();//obtiene el tamaño de una lista
        nueva.isEmpty();//devuelve true o false si la lista está vacía

        List<List<Que>> l2 = new ArrayList<List<Que>>();//recorrer una lista de listas (tabla o matriz)
        l2.get(0).get(0);//como obtener el la celda cero en la fila cero?

        for (Que actual : nueva) {//como recorrer la lista
            actual.setB1("akjsdjkasd");
        }
        for (int i = 0; i < nueva.size(); i++) {//otra forma de recorrer la lista
            nueva.get(i).setB1("asdasdasd");
        }
        for (Iterator<Que> it = nueva.iterator(); it.hasNext();) {//otra forma de recorrer la lista
            it.next().setB1("asdasdasd");
        }
    }
}
