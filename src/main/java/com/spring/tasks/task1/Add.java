package com.spring.tasks.task1;

import org.springframework.beans.factory.annotation.Autowired;

public class Add implements Process {

//    @Autowired
//    private Process process;

    public void calculate(double n1, double n2) {
        System.out.println("The Result is = " + (n1 + n2));
    }
}
