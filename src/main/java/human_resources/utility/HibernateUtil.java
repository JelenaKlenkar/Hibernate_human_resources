/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.utility;


import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Jelena
 */
public class HibernateUtil {
    private static Session session;
    
    
     protected HibernateUtil(){
         
     }
     public static Session getSession(){
         if(session==null){
             try{
                 session=new Configuration().configure().buildSessionFactory().openSession();
                 
             }catch(Throwable e){
                 throw new ExceptionInInitializerError(e);
             }
         }
         return session;
     }
    
}
