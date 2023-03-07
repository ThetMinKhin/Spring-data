package com.example.democallbacktemplete;

import com.example.democallbacktemplete.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
public class DemoCallbackTempleteApplication implements CommandLineRunner {
    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(DemoCallbackTempleteApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        employeeService.listAllEmployee()
                .forEach(System.out::println);
    }
}
