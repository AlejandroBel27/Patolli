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
@Table(name = "jugador")
@NamedQueries({
    @NamedQuery(name = "Jugador.findAll", query = "SELECT j FROM Jugador j"),
    @NamedQuery(name = "Jugador.findByIdjugador", query = "SELECT j FROM Jugador j WHERE j.idjugador = :idjugador"),
    @NamedQuery(name = "Jugador.findByNombre", query = "SELECT j FROM Jugador j WHERE j.nombre = :nombre"),
    @NamedQuery(name = "Jugador.findByEstado", query = "SELECT j FROM Jugador j WHERE j.estado = :estado")})
public class Jugador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idjugador")
    private Integer idjugador;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "estado")
    private String estado;

    public Jugador() {
    }

    public Jugador(Integer idjugador) {
        this.idjugador = idjugador;
    }

    public Integer getIdjugador() {
        return idjugador;
    }

    public void setIdjugador(Integer idjugador) {
        this.idjugador = idjugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idjugador != null ? idjugador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jugador)) {
            return false;
        }
        Jugador other = (Jugador) object;
        if ((this.idjugador == null && other.idjugador != null) || (this.idjugador != null && !this.idjugador.equals(other.idjugador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Jugador[ idjugador=" + idjugador + " ]";
    }
    
}
