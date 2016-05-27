package test.crud;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

import model.Person;

import org.junit.Test;

import com.ibatis.sqlmap.client.SqlMapClient;

public class UpdateTest {

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
	
	@Test
	public void testUpdateOne()
	{
		try {
			Person person2=new Person("4","a2",200);
			client.update("Person.UpdatePerson", person2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
