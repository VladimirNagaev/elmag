package com.vovan;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
public class App {
    @RequestMapping("/register")
    public String register(HttpServletRequest req, Model m) {
        //read the provided form data
        String name = req.getParameter("name");
        String pass = req.getParameter("pass");
        String email = req.getParameter("email");
        String address = req.getParameter("address");

        if (!Objects.equals(name, "") && !Objects.equals(pass, "") && !Objects.equals(email, "")) {

            Client client = new Client();

            client.setLogin(name);
            client.setName(name);
            client.setPasswordHash(Integer.toString(pass.hashCode()));
            client.seteMail(email);
            client.setAddressOfDelivery(address);
            GenericDao<Client> dao = new GenericDao<>();
            dao.save(client);


            return "registerOk";
        } else {
            return "RegisterNeOk";
        }


    }

//    public static void main(String[] args) {
//
//        Client client1 = new Client(1);
//        client1.seteMail("email@lox.com") ;
//        client1.setAddressOfDelivery("NaHer emu nichego ne dostavlyt");
//        client1.setLogin("DER_Dolbayob");
//
//       // SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//        GenericDao<Client> dao = new GenericDao<>();
//        dao.save(client1);
//    }
}
