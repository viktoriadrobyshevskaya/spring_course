package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
            // создаем секцию и 3 детей. сохраняем секцию. дети и джоин таблица каскадом сохранятся
            session = factory.getCurrentSession();

            Section section = new Section("Dance");
            Child child = new Child("Igor", 5);
            Child child2 = new Child("Dima", 6);

            section.addChildToSection(child);
            section.addChildToSection(child2);

            session.beginTransaction();
            // если каскад установлен на ALL
            session.save(section);

//            // если в каскаде нет метода SAVE
//            session.persist(section);

            session.getTransaction().commit();
            System.out.println("Done!");

//            // создаем ребенка и 3 кружка. сохраняем ребенка. кружки и джоин таблица каскадом сохранятся
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Ballet");
//            Section section2 = new Section("Drawing");
//            Section section3 = new Section("Piano");
//            Child child = new Child("Katya", 8);
//
//            child.addSectionToChild(section1);
//            child.addSectionToChild(section2);
//            child.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.save(child);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            // выводим секцию и инфу о детях, которые там учатся
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            // получаем ребенка и инфу по его секциям
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            System.out.println(child.getSectionList());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
//            // удаляем секцию (нужно изменить каскад на без ремува!!!)
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            // удаляем ребенка (нужно изменить каскад на без ремува!!!)
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 4);
//            session.delete(child);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

        } finally {
            if (session != null) {
                session.close();
            }
            factory.close();
        }
    }
}
