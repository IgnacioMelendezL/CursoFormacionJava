package com.curso.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Listener1 implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Aplicación parada y acabada");
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Arranca la aplicación");
	}
}