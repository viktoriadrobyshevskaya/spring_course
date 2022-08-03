package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Autowired                  //пример аутовайреда и квалифайера на полях
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println("Person bean is created");
    }

////    @Autowired                         // пример, что автовайред работает на конструкторе
//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//     }

//    @Autowired                         // пример, что автовайред работает на конструкторе + квалифайер
//    public Person(@Qualifier("dogBean") Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

//       @Autowired
//   @Qualifier("catBean")                 // пример, что аутовайред и квалифайер работает на сеттере
    public void setPet(Pet pet) {
        System.out.println("Class Person: setPet pet");
        this.pet = pet;
    }

//    @Autowired                             // пример, что автовайред работает на любом методе, не только на сеттере
//    public void anyMethodName(Pet pet) {
//        System.out.println("Class Person: anyMethodName pet");
//        this.pet = pet;
//    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
