package com.naveen.hibernate3.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Address address1= new Address("DUBAI");
    	Address address2= new Address("sharjah");
    	Address address3= new Address("Delhi");
    	
    	
    	
       UserDetails user = new UserDetails();
       user.setUserId(3);
       user.setUserName("gurwinder");
       user.setJoinDate(new Date());
       user.getAddress().add(address1);
       user.getAddress().add(address2);
       user.getAddress().add(address3);
       
       
       
       Configuration conf = new Configuration().configure();
       SessionFactory sf = conf.buildSessionFactory();
       Session session = sf.openSession();
       
       UserDetails ud = null;
       
       try {
    	   
    	   ud = (UserDetails) session.get(UserDetails.class, 5);
    	   
       
       }
       catch(Exception e)
       {
    	   System.out.println("you have got an error");
    	   e.printStackTrace();
    	   
       }
       finally {	
    	   session.close();
       }
       
       
       System.out.println(ud);
      
       
    }
}
