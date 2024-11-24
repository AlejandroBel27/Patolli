/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Tablero;
import exceptions.Exceptions;
import interfacesDao.ITableroDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author equipo 1 
 */
public class DaoTablero implements ITableroDao {
    
    EntityManagerFactory emf;
    EntityManager em;

    public DaoTablero() {
        emf = Persistence.createEntityManagerFactory("PatolliPU");
    }

    @Override
    public void iniciarTablero(Tablero tablero) throws Exceptions {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.persist(tablero);

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }
            System.out.println("Error al crear el tablero:" + e.getMessage());
            throw new Exceptions("Error al obtener el tablero", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void actualizarTablero(Tablero tablero) throws Exceptions {

        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.merge(tablero);

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }
            System.out.println("Error al actualizar el tablero:" + e.getMessage());
            throw new Exceptions("Error al actualizar el tablero", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
        
    }

    @Override
    public void EliminarTablero(Tablero tablero) throws Exceptions {
        
         try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.remove(tablero);

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }
            System.out.println("Error al eliminar el tablero:" + e.getMessage());
            throw new Exceptions("Error al eliminar el tablero", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }
    
}
