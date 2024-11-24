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
@Table(name = "partida")
@NamedQueries({
    @NamedQuery(name = "Partida.findAll", query = "SELECT p FROM Partida p"),
    @NamedQuery(name = "Partida.findByIdpartida", query = "SELECT p FROM Partida p WHERE p.idpartida = :idpartida"),
    @NamedQuery(name = "Partida.findByEstado", query = "SELECT p FROM Partida p WHERE p.estado = :estado")})
public class Partida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idpartida")
    private Integer idpartida;
    @Column(name = "estado")
    private Short estado;

    public Partida() {
    }

    public Partida(Integer idpartida) {
        this.idpartida = idpartida;
    }

    public Integer getIdpartida() {
        return idpartida;
    }

    public void setIdpartida(Integer idpartida) {
        this.idpartida = idpartida;
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpartida != null ? idpartida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partida)) {
            return false;
        }
        Partida other = (Partida) object;
        if ((this.idpartida == null && other.idpartida != null) || (this.idpartida != null && !this.idpartida.equals(other.idpartida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Partida[ idpartida=" + idpartida + " ]";
    }
    
}
