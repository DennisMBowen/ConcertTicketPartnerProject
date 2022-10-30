package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.ListTicket;

/**
 * @author Dennis Bowen - dmbowen
 * CIS175 - Fall 2022
 * Oct 29, 2022
 */
public class ListTicketHelper {
	
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ConcertTicketPartnerProject");
	
		public void insertTicket (ListTicket t) {
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			em.persist(t);
			em.getTransaction().commit();
			em.close();
		}
				
		public List<ListTicket> showAllTickets(){
			EntityManager em = emfactory.createEntityManager();
			List<ListTicket>allTickets = em.createQuery("SELECT i FROM ListTicket i").getResultList();
			return allTickets;
		}
		
		public void deleteTicket(Integer id) {
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			ListTicket toDelete = em.find(ListTicket.class, id);
			em.remove(toDelete);
			em.getTransaction().commit();
			em.close();
		}
		
		public ListTicket findTicket(int id) {
			// TODO Auto-generated method stub
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			ListTicket foundTicket = em.find(ListTicket.class, id);
			em.getTransaction().commit();
			em.close();
			return foundTicket;
		}


		public void updateTicket(ListTicket ticket) {
			// TODO Auto-generated method stub
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			em.merge(ticket);
			em.getTransaction().commit();
			em.close();
			
		}

}
