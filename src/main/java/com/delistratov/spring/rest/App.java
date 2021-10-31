package com.delistratov.spring.rest;

import com.delistratov.spring.rest.configuration.MyConfig;
import com.delistratov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = applicationContext.getBean("communication", Communication.class);
//        List<Employee> employeeList = communication.getAllEmployees();
//        System.out.println(employeeList);

//        System.out.println(communication.getEmployee(1));
//        Employee employee = new Employee("Sveta", "Sokolova", "Sales", 1300);
//        employee.setId(8);
//        communication.saveEmployee(employee);
        communication.deleteEmployee(8);

    }
}
