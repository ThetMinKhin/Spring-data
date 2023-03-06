package com.solt;

import com.solt.service.EmployeeData;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        EmployeeData employeedata=context.getBean(EmployeeData.class);
        employeedata.listEmail()
                .forEach(System.out::println);
    }
}
