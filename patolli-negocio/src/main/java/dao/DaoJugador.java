
package dao;

import entidades.Jugador;
import exceptions.Exceptions;
import interfacesDao.IJugadorDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Equipo 1
 */
public class DaoJugador implements IJugadorDao{
    
    EntityManagerFactory emf;
    EntityManager em;
    
    public DaoJugador(){
        emf = Persistence.createEntityManagerFactory("PatolliPU");
    }
    

    @Override
    public void registrarJugador(Jugador jugador) throws Exceptions {
        try{
            em = emf.createEntityManager();
            em.getTransaction().begin();
            
            em.persist(jugador);
            
            em.getTransaction().commit();
        }catch(Exception e){
            if(em != null){
                em.getTransaction().rollback();
            }
            System.out.println("Error al registrar Jugador:" + e.getMessage());
            throw new Exceptions("Error al obtener Jugador",e);
        }finally{
            if(em !=  null){
                em.close();
            }
        }
    }

    @Override
    public void actulizaJugador(Jugador jugador) throws Exceptions {
        try{
            em = emf.createEntityManager();
            em.getTransaction().begin();
            
            em.merge(jugador);
            
            em.getTransaction().commit();
        }catch(Exception e){
            if(em != null){
                em.getTransaction().rollback();
            }
            System.out.println("Error al actualizar Jugador:" + e.getMessage());
            throw new Exceptions("Error al actualizar Jugador",e);
        }finally{
            if(em !=  null){
                em.close();
            }
        }
    }

    @Override
    public void eliminarJugador(Jugador jugador) throws Exceptions {
        try{
            em = emf.createEntityManager();
            em.getTransaction().begin();
            
            em.remove(jugador);
            
            em.getTransaction().commit();
        }catch(Exception e){
            if(em != null){
                em.getTransaction().rollback();
            }
            System.out.println("Error al Eliminar Jugador:" + e.getMessage());
            throw new Exceptions("Error al Eliminar Jugador",e);
        }finally{
            if(em !=  null){
                em.close();
            }
        }
    }
    
}
