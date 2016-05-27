package test;
import static org.junit.Assert.*;

import model.Log;

import org.junit.Test;

import dao.LogDaoImpl;


/**
 * @author lcx
 *
 */
public class LogDaoTest {

	/**
	 * Test method for {@link dao.LogDaoImpl#insert(model.Log)}.
	 */
	@Test
	public void testInsert() {
		LogDaoImpl dao=new LogDaoImpl();
		Log person=dao.insert(new Log("5","2009-01-01","ADD A LOG"));
	}

}
