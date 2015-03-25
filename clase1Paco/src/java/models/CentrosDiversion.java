/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @aut
 * hor alberto
 */
@Entity
@Table(name = "centros_diversion")
@NamedQueries({
    @NamedQuery(name = "CentrosDiversion.findAll", query = "SELECT c FROM CentrosDiversion c")})
public class CentrosDiversion implements Serializable {
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
    @Column(name = "capacidad_personas")
    private int capacidadPersonas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_lugar")
    private int tipoLugar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_fundacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFundacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fk_pais")
    private int fkPais;

    public CentrosDiversion() {
    }

    public CentrosDiversion(Integer codigo) {
        this.codigo = codigo;
    }

    public CentrosDiversion(Integer codigo, String nombre, int capacidadPersonas, int tipoLugar, Date fechaFundacion, int fkPais) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidadPersonas = capacidadPersonas;
        this.tipoLugar = tipoLugar;
        this.fechaFundacion = fechaFundacion;
        this.fkPais = fkPais;
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

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    public int getTipoLugar() {
        return tipoLugar;
    }

    public void setTipoLugar(int tipoLugar) {
        this.tipoLugar = tipoLugar;
    }

    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public int getFkPais() {
        return fkPais;
    }

    public void setFkPais(int fkPais) {
        this.fkPais = fkPais;
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
        if (!(object instanceof CentrosDiversion)) {
            return false;
        }
        CentrosDiversion other = (CentrosDiversion) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.CentrosDiversion[ codigo=" + codigo + " ]";
    }
    
}
