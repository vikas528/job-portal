package com.blueyonder.team2.JobPortalHireNow;

import com.blueyonder.team2.JobPortalHireNow.model.Employee;
import com.blueyonder.team2.JobPortalHireNow.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class JobPortalHireNowApplication {
	public static void main(String[] args) {
		SpringApplication.run(JobPortalHireNowApplication.class, args);
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//		Employee emp1 = ctx.getBean(Employee.class);
//		Employee emp2 = ctx.getBean(Employee.class);
//
//		emp1.setEmployeeName("Vikas");
//		System.out.println(emp1);
//
//		Product prod = ctx.getBean(Product.class);
	}
}
