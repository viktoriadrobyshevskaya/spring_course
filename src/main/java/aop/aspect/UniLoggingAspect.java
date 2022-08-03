package aop.aspect;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents()");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student student1 = students.get(0);
        String name = student1.getName();
        name = "Mr." + name;
        student1.setName(name);

        double avgGrade = student1.getAvgGrade();
        avgGrade = avgGrade - 1;
        student1.setAvgGrade(avgGrade);

        System.out.println("логируем получение списка студентов после метода getStudents()");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())",
            throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс исключения " + exception);
    }

//    @After("execution(* getStudents())")
//    public void afterGetStudentsLoggingAdvice() {
//        System.out.println("afterGetStudentsLoggingAdvice: логируем выброс исключения или нормальное завершение метода");
//    }


}
