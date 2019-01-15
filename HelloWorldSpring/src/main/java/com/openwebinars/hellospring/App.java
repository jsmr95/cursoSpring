package com.openwebinars.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		//abrimos el contenedor
		ApplicationContext appContext = 
				new ClassPathXmlApplicationContext("com/openwebinars/xml/beans.xml");
		
		Mundo m = (Mundo) appContext.getBean("mundo");
		
		System.out.println(m.getSaludo());
		
		//Cerramos nuestro contenedor de inversión de control
		//hacemos un casting a appContext y lo cerramos con .close()
		((ConfigurableApplicationContext) appContext).close();
		
	}
}
