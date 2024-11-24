/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author gilbert
 */
@Entity
@Table(name = "casilla")
@NamedQueries({
    @NamedQuery(name = "Casilla.findAll", query = "SELECT c FROM Casilla c"),
    @NamedQuery(name = "Casilla.findByIdcasilla", query = "SELECT c FROM Casilla c WHERE c.idcasilla = :idcasilla"),
    @NamedQuery(name = "Casilla.findByTipo", query = "SELECT c FROM Casilla c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "Casilla.findByColor", query = "SELECT c FROM Casilla c WHERE c.color = :color")})
public class Casilla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcasilla")
    private Integer idcasilla;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "color")
    private String color;

    public Casilla() {
    }

    public Casilla(Integer idcasilla) {
        this.idcasilla = idcasilla;
    }

    public Integer getIdcasilla() {
        return idcasilla;
    }

    public void setIdcasilla(Integer idcasilla) {
        this.idcasilla = idcasilla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcasilla != null ? idcasilla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Casilla)) {
            return false;
        }
        Casilla other = (Casilla) object;
        if ((this.idcasilla == null && other.idcasilla != null) || (this.idcasilla != null && !this.idcasilla.equals(other.idcasilla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Casilla[ idcasilla=" + idcasilla + " ]";
    }
    
}
