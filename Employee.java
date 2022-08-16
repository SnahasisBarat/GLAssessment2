package JPA2.com.jpa2;

import javax.persistence.*;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;
import org.hibernate.mapping.List;

public class Employee {
	 public static void main(String args[])

	  {

	    EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");

	    EntityManager em=emf.createEntityManager();

	    em.getTransaction().begin();
	    EmpEntity e1=new EmpEntity();
	    e1.setEmpno(1);
	    e1.setEname("Snehasis");
	    e1.setSalary(42000.0);
	    
	    EmpEntity e2=new EmpEntity();
	    e2.setEmpno(2);
	    e2.setEname("Akash");
	    e2.setSalary(50000.0);
	    em.persist(e1);  
        em.persist(e2);  
       
        Query query = em.createQuery( "Select e from EmpEntity e ");  
        
        @SuppressWarnings("unchecked")  
      List<EmpEntity> list=(List<EmpEntity>)query.getResultList( );  

      List list=(List)query.getResultList( );  
         
        System.out.print("e_id");  
        System.out.print("\t e_name");  
       System.out.println("\t salary");  
       System.out.println("\t designation");
          
          
        for( EmpEntity s:list ){  
           System.out.print( e.getEname( ));  
           System.out.print("\t" +  e.getSalary( ));  
          System.out.print("\t" + e.getDesignation( ));  
          System.out.println();  
        }  

em.getTransaction().commit();  
          
        emf.close();  
        em.close();  
          
    }  
}  



}
