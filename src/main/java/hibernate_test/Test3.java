package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            //выводим всех работников
            List<Employee> employees = session.createQuery("from Employee").getResultList();

            for (Employee e : employees) {
                System.out.println(e);
            }

            //выводим работников по имени Олег
//            List<Employee> employees2 = session.createQuery("from Employee " + "where name='Oleg'").getResultList();
//
//            for (Employee e : employees2) {
//                System.out.println(e);
//            }

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
