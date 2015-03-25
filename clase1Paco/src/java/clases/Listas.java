/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author alberto
 */
@SessionScoped
@ManagedBean(name = "listaController")
public class Listas {

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
        for (int i=0;i<nueva.size();i++) {//otra forma de recorrer la lista
            nueva.get(i).setB1("asdasdasd");
        }
        for (Iterator<Que> it=nueva.iterator();it.hasNext();) {//otra forma de recorrer la lista
            it.next().setB1("asdasdasd");
        }
    }
}
