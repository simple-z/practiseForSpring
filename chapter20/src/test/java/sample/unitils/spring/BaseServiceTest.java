package sample.unitils.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;

import static org.junit.Assert.assertNotNull;

@SpringApplicationContext({"smart-service.xml", "smart-dao.xml"})
public class BaseServiceTest extends UnitilsJUnit4 {
	@SpringApplicationContext
	public ApplicationContext applicationContext;
	@Test
	public void testApplicationContext(){
		assertNotNull(applicationContext);
	}
}
