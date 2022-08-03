package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary universityLibrary = context.getBean("uniLibrary", UniLibrary.class);
              Book book = context.getBean("book", Book.class);
        universityLibrary.getBook();
        universityLibrary.getMagazine();
        universityLibrary.returnBook();
        universityLibrary.returnMagazine();
        universityLibrary.addBook("Sasha", book);
        universityLibrary.addMagazine();

//        SchoolLibrary library = context.getBean("schoolLibrary", SchoolLibrary.class);
//        library.getBook();

        context.close();
    }
}
