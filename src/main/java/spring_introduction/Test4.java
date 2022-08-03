package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
//        // если не прописан scope, он по умолчанию синглтон. Проверяем, что объект не создается дважды:
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
//        Dog dog = context.getBean("myPet", Dog.class);
//        Dog dog2 = context.getBean("myPet", Dog.class);
//        System.out.println(dog == dog2);
//        context.close();
//
//        // проверяем, что даже если мы создали дважды объект и присвоили им разные имена, это все тот же объект:
//        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext2.xml");
//        Dog dog3 = context2.getBean("myPet", Dog.class);
//        dog3.setName("Belka");
//        Dog dog4 = context2.getBean("myPet", Dog.class);
//        dog4.setName("Strelka");
//        System.out.println(dog3.getName());
//        System.out.println(dog4.getName());
//        context2.close();
//
//        // тестируем скоуп прототайп:
//        ClassPathXmlApplicationContext context3 = new ClassPathXmlApplicationContext("applicationContext2.xml");
//        Dog dog5 = context3.getBean("myPet", Dog.class);
//        dog5.setName("Belka");
//        Dog dog6 = context3.getBean("myPet", Dog.class);
//        dog6.setName("Strelka");
//        System.out.println(dog5.getName());
//        System.out.println(dog6.getName());
//        context3.close();

    }
}
