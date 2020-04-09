package com.smart.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class AutowireTest {
	public ApplicationContext factory = null;

	private static String[] CONFIG_FILES = { "com/smart/auto/beans.xml" };

	@BeforeMethod
	public void setUp() throws Exception {
		factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
		
	}

	@Test
	public void testAutoByName(){
		Boss boss = (Boss) factory.getBean("boss");
		assertNotNull(boss);
		System.out.println("boss:"+boss);
	}
	
}
