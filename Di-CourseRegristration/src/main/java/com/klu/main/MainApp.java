package com.klu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klu.Model.CourseRegristration;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		CourseRegristration cr=(CourseRegristration)context.getBean("courseReg");
		cr.display();

	}

}