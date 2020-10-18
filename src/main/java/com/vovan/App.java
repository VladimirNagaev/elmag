package com.vovan;

import org.hibernate.SessionFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Client client1 = new Client(1);
        client1.seteMail("email@lox.com") ;
        client1.setAddressOfDelivery("NaHer emu nichego ne dostavlyt");
        client1.setLogin("DER_Dolbayob");

       // SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        GenericDao<Client> dao = new GenericDao<>();
        dao.save(client1);
    }
}
