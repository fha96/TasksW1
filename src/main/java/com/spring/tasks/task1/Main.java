package com.spring.tasks.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(BeanFactory.class);
        Add add = ac.getBean(Add.class);
        add.calculate(2, 3);
        Subtract subtract = ac.getBean(Subtract.class);
        subtract.calculate(5, 3);
        Multiply multiply = ac.getBean(Multiply.class);
        multiply.calculate(3, 4);
        Divide divide = ac.getBean(Divide.class);
        divide.calculate(6, 2);

    }
}
