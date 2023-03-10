package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RunnersInBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RunnersInBootApplication.class, args);
		         Runners runners = context.getBean(Runners.class,args) ;
				 /*
				 *Runners  run only once in at the start of application
				 * Rum method call runners
				 * In real Scenario If we want to load a static data from Db to catch memory Once the application started instead every time hitting the
				 * user to Db to get data
				 * In this scenario runner will work  once
				 * There are  2 ways to Implement runner using applicationRunner and CommandlineRunner
				 * Diff B/t two is ApplicationRunner takes applications as args and CommandLine takes String as args
				  */


		  /*
		  *  If you want to enter into the bean life cycle which is manage  by IOC
		  * Used @PostConstruct and @ preDestroy at method level or
		  *  implements InitialisingBean  with @override method  or Implementing disposableBean  with @overriding methods
		  *
		   */
	}

}
