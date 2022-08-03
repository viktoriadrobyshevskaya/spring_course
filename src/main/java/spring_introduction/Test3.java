package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
//        //как мы создаем класс Персон c Петом самостоятельно?
//        Pet pet = new Dog();
//        Person person = new Person(pet);
//        person.callYourPet();
//
//        // создаем Pet и Person с помощью конфиг файла
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet1 = context.getBean("myPet", Pet.class);
//        Person person1 = new Person(pet1);
//        person1.callYourPet();
//        context.close();
//
//        // создаем Person с помощью конфиг файла (Pet подтягивается сам)
//        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Person person2 = context2.getBean("myPerson", Person.class);
//        person2.callYourPet();
//        context2.close();
//
        // создаем Person и присвоение полям значений с помощью конфиг файла (Pet подтягивается сам)
        ClassPathXmlApplicationContext context3 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person4 = context3.getBean("myPerson", Person.class);
        person4.callYourPet();
        System.out.println(person4.getSurname());
        System.out.println(person4.getAge());
        context3.close();
    }
}
