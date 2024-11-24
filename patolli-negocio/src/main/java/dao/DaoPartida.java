/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Partida;
import exceptions.Exceptions;
import interfacesDao.IPartidaDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gilbert
 */
public class DaoPartida implements IPartidaDao {

    EntityManagerFactory emf;
    EntityManager em;

    public DaoPartida() {
        emf = Persistence.createEntityManagerFactory("PatolliPU");
    }

    @Override
    public void crearPartida(Partida partida) throws Exceptions {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.persist(partida);

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }
            System.out.println("Error al crear la partida:" + e.getMessage());
            throw new Exceptions("Error al obtener la partida", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void actualizarPartida(Partida partida) throws Exceptions {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.merge(partida);

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }
            System.out.println("Error al actualizar la partida:" + e.getMessage());
            throw new Exceptions("Error al actualizar la partida", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void EliminarPartida(Partida partida) throws Exceptions {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.remove(partida);

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }
            System.out.println("Error al eliminar la partida:" + e.getMessage());
            throw new Exceptions("Error al eliminar la partida", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

}
