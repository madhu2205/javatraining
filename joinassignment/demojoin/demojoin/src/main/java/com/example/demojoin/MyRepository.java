package com.example.demojoin;


	import java.util.List;

import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.PersistenceUnit;
	import javax.persistence.Query;

	import org.springframework.stereotype.Repository;

	@Repository
	public class MyRepository {

		@PersistenceUnit
		private EntityManagerFactory emf;

		void getData() {
			EntityManager em;
			em = emf.createEntityManager();

			 //update
//			em.getTransaction().begin();
//			
//			String jsql="";
//			
//			jsql="update Student e set e.name='testing'"
//					+ " where e.id=100";
//			Query q;
//			q=em.createQuery(jsql);
//			q.executeUpdate();
////			

			//em.getTransaction().commit();

			// delete
//	         em.getTransaction().begin();
//			
//			String jsql="";
//			
//			jsql="delete from Student e where e.id=100";
//			Query q;
//			q=em.createQuery(jsql);
//			q.executeUpdate();
//			
//			
//			em.getTransaction().commit();
			// selectAll

			em.getTransaction().begin();

			String jsql = "";

			 jsql="select e from Student as e";
		
			 Query q;
		     q = em.createQuery(jsql);
		     
		    
		     List<Student> stdlist=q.getResultList();
		     for(Student s1:stdlist)
		     {
			
			     System.out.println("all record from Student");
			     
			     
		    	 System.out.println("Student ID= "+s1.getId()+" Student name is= "+s1.getName());
	     }
//		    
//		     q.getResultList();
// 		     q.getSingleResult();
			
			em.getTransaction().commit();
			
			//select
			
//			
//			em.getTransaction().begin();
//			
//			String jsql=" ";
//			jsql ="select e from Student as e where e.id=200";
//			Query q1;
//			q1=em.createQuery(jsql);
//			Student s2=(Student)q1.getSingleResult();
//			System.out.println("Student name is: "+s2.getName());
//			
//
//			em.getTransaction().commit();

		}
	}



