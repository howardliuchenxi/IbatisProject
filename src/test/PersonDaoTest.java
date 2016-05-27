package test;
import static org.junit.Assert.fail;

import model.Person;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import dao.PersonDaoImpl;

/**
 *  ��Ŀ��ƣ�
 *  �ļ�˵����
 *  ��Ҫ�ص㣺
 *  �汾�ţ�1.0
 *  �����ˣ�������
 *  ����ʱ�䣺2013-12-3
 **/

/**
 * @author lcx
 *
 */
public class PersonDaoTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("start.........");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("end.........");
	}

	@Test
	public void test() {
		PersonDaoImpl dao=new PersonDaoImpl();
		Person person=dao.insert(new Person("5","a5",50));
//		if(person==null)
//		fail("Not yet implemented");
		Assert.assertNull(person);
	}

}
