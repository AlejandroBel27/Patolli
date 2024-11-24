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
@Table(name = "tablero")
@NamedQueries({
    @NamedQuery(name = "Tablero.findAll", query = "SELECT t FROM Tablero t"),
    @NamedQuery(name = "Tablero.findByIdtablero", query = "SELECT t FROM Tablero t WHERE t.idtablero = :idtablero"),
    @NamedQuery(name = "Tablero.findByTama\u00f1o", query = "SELECT t FROM Tablero t WHERE t.tama\u00f1o = :tama\u00f1o"),
    @NamedQuery(name = "Tablero.findByDado", query = "SELECT t FROM Tablero t WHERE t.dado = :dado"),
    @NamedQuery(name = "Tablero.findByPosicionesOcupadas", query = "SELECT t FROM Tablero t WHERE t.posicionesOcupadas = :posicionesOcupadas")})
public class Tablero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idtablero")
    private Integer idtablero;
    @Column(name = "tama\u00f1o")
    private Integer tamaño;
    @Column(name = "dado")
    private Integer dado;
    @Column(name = "posicionesOcupadas")
    private String posicionesOcupadas;

    public Tablero() {
    }

    public Tablero(Integer idtablero) {
        this.idtablero = idtablero;
    }

    public Integer getIdtablero() {
        return idtablero;
    }

    public void setIdtablero(Integer idtablero) {
        this.idtablero = idtablero;
    }

    public Integer getTamaño() {
        return tamaño;
    }

    public void setTamaño(Integer tamaño) {
        this.tamaño = tamaño;
    }

    public Integer getDado() {
        return dado;
    }

    public void setDado(Integer dado) {
        this.dado = dado;
    }

    public String getPosicionesOcupadas() {
        return posicionesOcupadas;
    }

    public void setPosicionesOcupadas(String posicionesOcupadas) {
        this.posicionesOcupadas = posicionesOcupadas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtablero != null ? idtablero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tablero)) {
            return false;
        }
        Tablero other = (Tablero) object;
        if ((this.idtablero == null && other.idtablero != null) || (this.idtablero != null && !this.idtablero.equals(other.idtablero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Tablero[ idtablero=" + idtablero + " ]";
    }
    
}
