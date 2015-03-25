/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author alberto
 */
@Entity
@Table(name = "pais")
@NamedQueries({
    @NamedQuery(name = "Pais.findAll", query = "SELECT p FROM Pais p")})
public class Pais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "geo_latitud")
    private double geoLatitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "geo_longitud")
    private double geoLongitud;

    public Pais() {
    }

    public Pais(Integer codigo) {
        this.codigo = codigo;
    }

    public Pais(Integer codigo, String nombre, double geoLatitud, double geoLongitud) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.geoLatitud = geoLatitud;
        this.geoLongitud = geoLongitud;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getGeoLatitud() {
        return geoLatitud;
    }

    public void setGeoLatitud(double geoLatitud) {
        this.geoLatitud = geoLatitud;
    }

    public double getGeoLongitud() {
        return geoLongitud;
    }

    public void setGeoLongitud(double geoLongitud) {
        this.geoLongitud = geoLongitud;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pais)) {
            return false;
        }
        Pais other = (Pais) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Pais[ codigo=" + codigo + " ]";
    }
    
}
