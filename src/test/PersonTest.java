package test;
import model.Person;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lcx
 *
 */
public class PersonTest {

	@Test
	public void test() {
		ClassPathXmlApplicationContext ctc=new ClassPathXmlApplicationContext("beans.xml");
		Person person=(Person) ctc.getBean("person");
		System.out.println(person);
		System.out.println(ctc.getBean("person"));
	}

}
