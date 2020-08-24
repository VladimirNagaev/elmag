package com.vovan;


import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;


public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    static {
        try {
            sessionFactory = new Configuration().
                    addAnnotatedClass(Client.class).
                    addAnnotatedClass(Busket.class).
                    addAnnotatedClass(DoneOrdrs.class).
                    addAnnotatedClass(OrdersInWork.class).
                    addAnnotatedClass(Administrator.class).
                    addAnnotatedClass(Return.class).
                    addAnnotatedClass(Good.class).

                    configure().buildSessionFactory();
        } catch (Exception ex) {
            System.err.println(ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }


}
