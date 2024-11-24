/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Ficha;
import exceptions.Exceptions;
import interfacesDao.IFichaDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gilbert
 */
public class DaoFicha implements IFichaDao {

    EntityManagerFactory emf;
    EntityManager em;

    public DaoFicha() {
        emf = Persistence.createEntityManagerFactory("PatolliPU");
    }

    @Override
    public void crearFicha(Ficha ficha) throws Exceptions {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.persist(ficha);

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }
            System.out.println("Error al crear la ficha:" + e.getMessage());
            throw new Exceptions("Error al obtener la ficha", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void actualizarFicha(Ficha ficha) throws Exceptions {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.merge(ficha);

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }
            System.out.println("Error al actualizar la ficha:" + e.getMessage());
            throw new Exceptions("Error al actualizar la ficha", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void EliminarFicha(Ficha ficha) throws Exceptions {
        try{
            em = emf.createEntityManager();
            em.getTransaction().begin();
            
            em.remove(ficha);
            
            em.getTransaction().commit();
        }catch(Exception e){
            if(em != null){
                em.getTransaction().rollback();
            }
            System.out.println("Error al eliminar la ficha:" + e.getMessage());
            throw new Exceptions("Error al eliminar la ficha",e);
        }finally{
            if(em !=  null){
                em.close();
            }
        }
    }

}
