/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.List;
import models.CentrosDiversion;
import models.Pais;
import models.TipoLugar;

/**
 *
 * @author alberto
 */
public class MiForm {

    private String mensaje = "Mi primer mensaje =')";
    private List<CentrosDiversion> listaDatos = new ArrayList<CentrosDiversion>();
    private List<Pais> listaPais = new ArrayList<Pais>();
    private List<TipoLugar> listaLugar = new ArrayList<TipoLugar>();
    String var1 = "m1", var2 = "m2", var3 = "m3";
    CentrosDiversion nuevo=new CentrosDiversion();

    public CentrosDiversion getNuevo() {
        return nuevo;
    }

    public void setNuevo(CentrosDiversion nuevo) {
        this.nuevo = nuevo;
    }
    

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    public String getVar3() {
        return var3;
    }

    public void setVar3(String var3) {
        this.var3 = var3;
    }

    public List<TipoLugar> getListaLugar() {
        return listaLugar;
    }

    public void setListaLugar(List<TipoLugar> listaLugar) {
        this.listaLugar = listaLugar;
    }
    public String variablePublica;
    Integer contadorEntrada = 0;
    Integer contadorSalida = 0;
    Integer valorRecibido = 0;

    public Integer getValorRecibido() {
        valorRecibido++;
        return valorRecibido;
    }

    public void setValorRecibido(Integer valorRecibido) {
        this.valorRecibido = valorRecibido;
    }

    public List<CentrosDiversion> getListaDatos() {
//        CentrosDiversion valor = new CentrosDiversion();
//        valor.setNombre("entradas " + contadorEntrada);//agregar valores al objeto
//        valor.setNombre("salidas " + contadorSalida);//agregar valores al objeto
//        listaDatos.add(valor);
//        contadorEntrada++;
        return listaDatos;
    }

    public void setListaDatos(List<CentrosDiversion> lista) {
        contadorSalida++;
        this.listaDatos = lista;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public List<Pais> getListaPais() {
        return listaPais;
    }

    public void setListaPais(List<Pais> listaPais) {
        this.listaPais = listaPais;
    }
}
