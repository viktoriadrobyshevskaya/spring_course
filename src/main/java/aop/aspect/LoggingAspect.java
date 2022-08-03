package aop.aspect;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
//
//    @Pointcut("execution(* aop.UniversityLibrary.*(..))")
//    private void method() {
//    }
//
//    @Pointcut("execution(public void aop.UniversityLibrary.returnMagazine())")
//    private void method2() {
//    }
//
//    @Pointcut("method() && !method2()")
//    private void method3() {
//    }
//
//    @Before("method3()")
//    public void beforeAllMethodsExeptReturnMagazine() {
//        System.out.println("Мы выводим этот метод");
//    }

    //
//    @Pointcut("execution(* aop.UniversityLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* aop.UniversityLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1 ");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2 ");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3 ");
//    }

    @Before("aop.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("MethodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object o : arguments) {
                if (o instanceof Book) {
                    Book book = (Book) o;
                    System.out.println("Информация о книге: \nНазвание книги - " + ((Book) o).getName() +
                            ", \nАвтор книги - " + ((Book) o).getAuthor() +
                            ", \nГод выпуска - " + ((Book) o).getYearOfPublication());
                } else {
                    System.out.println("Книгу добавил: " + o);
                }
            }
        }

        System.out.println("beforeAddLoggingAdvice: логирование попытки получить книгу/журнал.");
        System.out.println("___________________________________");
    }
}
