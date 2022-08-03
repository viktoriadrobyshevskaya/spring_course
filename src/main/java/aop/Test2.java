package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);
        university.addStudent();
        try {
            List<Student> list = university.getStudents();
            System.out.println(list);
        } catch (Exception e) {
            System.out.println("Было поймано исключение " + e);
        }
        context.close();
    }
}
