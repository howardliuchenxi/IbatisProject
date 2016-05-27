package test.crud;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

import model.Person;

import org.junit.Test;

import com.ibatis.sqlmap.client.SqlMapClient;

public class InsertTest {


	static SqlMapClient client;
	static
	{
		try {
			Reader reader=com.ibatis.common.resources.Resources.getResourceAsReader("sqlMapConfig.xml");
			client=com.ibatis.sqlmap.client.SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * 测试插入一个人
	 */
	@Test
	public void testInsertOne()
	{
		Person newPerson =new Person("4","a4",40);
		try {
			client.insert("Person.insertPerson", newPerson);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
