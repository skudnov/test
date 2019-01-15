package com.springinaction.springidol;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainClass {
  public static void main(String[] args) {
		 ApplicationContext context = new FileSystemXmlApplicationContext("resources//spring-idol.xml");
		Performer performer = (Performer) context.getBean("kenny");
		performer.perform();
	}
}