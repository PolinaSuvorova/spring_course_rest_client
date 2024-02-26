package com.polina.spring.rest;

import com.polina.spring.rest.configuration.MyConfig;
import com.polina.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployee = communication.getAllEmployees();
        for (Employee emp : allEmployee) {
            System.out.println(emp);
        }

        System.out.println("Hello World!");

        Employee emp = new Employee(0, "Petr", "Sidorov", "HR", 2000);
        communication.saveEmployee(emp);

        Employee emp2 = communication.getEmployee(emp.getId());
        emp2.setSalary(3000);
        communication.saveEmployee(emp2);

        communication.deleteEmployee(emp2.getId());
    }
}
