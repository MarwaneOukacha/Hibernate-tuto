package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.Configurable;


public class App 
{
    public static void main( String[] args )
    {
        Configuration con =new Configuration().configure().addAnnotatedClass(null);
        
        SessionFactory sf=con.buildSessionFactory();
        
        Session session=sf.openSession();
        
        Transaction tr=session.beginTransaction();
        
        session.save(null);
        
        tr.commit();
    }
}
