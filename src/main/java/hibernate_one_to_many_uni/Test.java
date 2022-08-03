package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            // добавляем департмент и двух имплои. сохраняем.
            session = factory.getCurrentSession();

            Department department = new Department("HR", 1500, 500);
            Employee employee1 = new Employee("Oleg", "Sidorov", 800);
            Employee employee2 = new Employee("Semen", "Yurkov", 900);

            department.addEmployeeToDepartment(employee1);
            department.addEmployeeToDepartment(employee2);

            session.beginTransaction();
            session.save(department);

            session.getTransaction().commit();
            System.out.println("Done!");

//            // выводим департамент и заодно всех его работников
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 2);
//
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            // выводим работника, его департамент - не можем. работнк не знает ничего о нем
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//
//            System.out.println(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
//            //  удаляем работника (его департамент не удалится)
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            //  удаляем департамент (все его работники удалятся)
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 2);
//            session.delete(department);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

        } finally {
            if (session != null) {
                session.close();
                factory.close();
            } else {
                factory.close();
            }
        }
    }
}
