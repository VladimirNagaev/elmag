package com.vovan;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import java.lang.reflect.ParameterizedType;

public class GenericDao<E> {
    public void save(E element){

            Session session = null;
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                session.save(element);
                session.getTransaction().commit();
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                if (session != null && session.isOpen()) {
                    session.close();
                }
            }

    }

    public E loadById(int id){
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Class<?> valueClazz = (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
            E result = (E) session.load(valueClazz, id);
            Hibernate.initialize(result);
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

}
