package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {
    public static void main(String[] args) {
//        //создаем класс Cat с помощью аннотации Component и прописанной локации, где сканировать бины:
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
//        Cat cat = context.getBean("catBean", Cat.class);
//        cat.say();
//        context.close();
//
//        //внедряем зависимость с помощью анн Автовайред к конструктору: находит, что анн компонент стоит у кота и человека.
//        // у человека на конструкторе написан автовайринг. он ищет в контексте подходящий бин и подставляет.
//        // если находит более одного - выбрасыв исключ, или пропиши @Qualifier, какой бин выбирать
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();
//        context.close();

//        //тестируем анн вэлью для полей.
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();
//        System.out.println(person.getAge());
//        System.out.println(person.getSurname());
//        context.close();

    }
}
