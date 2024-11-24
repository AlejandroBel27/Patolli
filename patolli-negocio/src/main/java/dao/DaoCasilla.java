/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Casilla;
import exceptions.Exceptions;
import interfacesDao.ICasillaDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author equipo 1
 */
public class DaoCasilla implements ICasillaDao{
    
    EntityManagerFactory emf;
    EntityManager em;
    
    public DaoCasilla(){
        emf = Persistence.createEntityManagerFactory("PatolliPU");
    }
    
    @Override
    public void registrarCasilla(Casilla casilla) throws Exceptions {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.persist(casilla);

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }
            System.out.println("Error al crear la casilla:" + e.getMessage());
            throw new Exceptions("Error al obtener la casilla", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void actualizarCasilla(Casilla casilla) throws Exceptions {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.merge(casilla);

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }
            System.out.println("Error al actualizar la casilla:" + e.getMessage());
            throw new Exceptions("Error al actualizar la casilla", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
        
    }

    @Override
    public void EliminarCasilla(Casilla casilla) throws Exceptions {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.remove(casilla);

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }
            System.out.println("Error al eliminar la casilla:" + e.getMessage());
            throw new Exceptions("Error al eliminar la casilla", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    
    
}
