package com.spring.tasks.task1;

import com.sun.org.apache.xpath.internal.operations.Div;
import org.springframework.context.annotation.Bean;

public class BeanFactory {

    @Bean
    public Add getAdd() {
        return new Add();
    }

    @Bean
    public Subtract getSub() {
        return new Subtract();
    }

    @Bean
    public Divide getDiv() {
        return new Divide();
    }

    @Bean
    public Multiply getMul() {
        return new Multiply();
    }

}
