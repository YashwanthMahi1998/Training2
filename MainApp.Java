package com.training.Tcs;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
Car obj=(Car) context.getBean("car");

System.out.println("Enter the brand:\n");
Scanner sc=new  Scanner(System.in);
obj.setBrand(sc.nextLine());

System.out.println(obj);


System.out.println("Enter your color:\n");
Color obj1=(Color) context.getBean("color");
Scanner scan=new  Scanner(System.in);
obj1.setColor(scan.nextLine());
System.out.println(obj1);

System.out.println("Enter your Tyrebrand:\n");
Tyre obj2=(Tyre) context.getBean("tyre");
Scanner scanner=new  Scanner(System.in);
obj2.setTyrebrand(scanner.nextLine());
System.out.println(obj2);

System.out.println("You have choosen :"  +obj + obj1 + obj2);

	

}
}