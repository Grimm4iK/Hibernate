import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        //Employee employee = new Employee("Vlad", 4000);



        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.beginTransaction();
        //currentSession.save(employee);



        currentSession.getTransaction().commit();




    }
}
