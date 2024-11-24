/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author gilbert
 */
@Entity
@Table(name = "ficha")
@NamedQueries({
    @NamedQuery(name = "Ficha.findAll", query = "SELECT f FROM Ficha f"),
    @NamedQuery(name = "Ficha.findByIdficha", query = "SELECT f FROM Ficha f WHERE f.idficha = :idficha"),
    @NamedQuery(name = "Ficha.findByJugador", query = "SELECT f FROM Ficha f WHERE f.jugador = :jugador"),
    @NamedQuery(name = "Ficha.findByColor", query = "SELECT f FROM Ficha f WHERE f.color = :color"),
    @NamedQuery(name = "Ficha.findByCasilla", query = "SELECT f FROM Ficha f WHERE f.casilla = :casilla")})
public class Ficha implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idficha")
    private Integer idficha;
    @Column(name = "jugador")
    private String jugador;
    @Column(name = "color")
    private String color;
    @Column(name = "casilla")
    private Integer casilla;

    public Ficha() {
    }

    public Ficha(Integer idficha) {
        this.idficha = idficha;
    }

    public Integer getIdficha() {
        return idficha;
    }

    public void setIdficha(Integer idficha) {
        this.idficha = idficha;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCasilla() {
        return casilla;
    }

    public void setCasilla(Integer casilla) {
        this.casilla = casilla;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idficha != null ? idficha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ficha)) {
            return false;
        }
        Ficha other = (Ficha) object;
        if ((this.idficha == null && other.idficha != null) || (this.idficha != null && !this.idficha.equals(other.idficha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Ficha[ idficha=" + idficha + " ]";
    }
    
}
