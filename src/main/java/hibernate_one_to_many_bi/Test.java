package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
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
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Department department = new Department("sales", 300, 800);
//            Employee employee1 = new Employee("Petr", "Petrov", 500);
//            Employee employee2 = new Employee("Sasha", "Smirnov", 700);
//            Employee employee3 = new Employee("Elena", "Vasileva", 800);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            department.addEmployeeToDepartment(employee3);
//            session.save(department);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
            // выводим департамент и заодно всех его работников
            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 4);

            System.out.println("Show department");
            System.out.println(department);

            System.out.println("Show employees of the department");
            System.out.println(department.getEmps());

            session.getTransaction().commit();
            System.out.println("Done!");
//
//            // выводим работника и его департамент
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
//            //  удаляем работника
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 4);
//
//            session.delete(employee);
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
