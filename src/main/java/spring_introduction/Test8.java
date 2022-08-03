package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test8 {
    public static void main(String[] args) {
//        // создаем контекст с помощью аннотаций, не с xml файлом, а с классом MyConfig
//        // (СПОСОБ 1 - помечаем все бины аннтоацией компонент и сканируем компоненты):
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();
//        context.close();
//
//        // создаем контекст с помощью аннотаций, не с xml файлом, а с классом MyConfig
//        // (СПОСОБ 2 - в классе MyConfig описываем все бины. Анн Компонент не нужна.):
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        Pet cat = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        System.out.println("Это один и тот же кот? - " + (cat == cat2));
//        cat.say();
//        context.close();

        // пример использования анн вэлью в классах бинах, при доб анн пропертисорс в майконфиг:
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();

    }
}
